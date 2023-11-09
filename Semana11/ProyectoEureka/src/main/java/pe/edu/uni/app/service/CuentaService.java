package pe.edu.uni.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.uni.app.dto.CuentaDto;

@Service
public class CuentaService {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(propagation = Propagation.REQUIRES_NEW, 
			rollbackFor = Exception.class)
	public CuentaDto crearCuenta(CuentaDto dto) {
		// Validar 1: CLIENTE
		String sql = "select count(1) cont from Cliente ";
		sql += "Where chr_cliecodigo = ?";
		int filas = jdbcTemplate.queryForObject(sql, Integer.class, dto.getCliente());
		if (filas == 0) {
			throw new RuntimeException("Codigo del cliente incorrecto.");
		}
		// Validar 2: MONEDA
		sql = "select count(1) cont from moneda ";
		sql += "Where chr_monecodigo = ?";
		filas = jdbcTemplate.queryForObject(sql, Integer.class, dto.getMoneda());
		if (filas == 0) {
			throw new RuntimeException("Codigo del moneda incorrecta.");
		}
		// Validar 3: IMPORTE
		if (dto.getImporte() <= 0) {
			throw new RuntimeException("El importe debe ser mayor que cero.");
		}
		// Paso 1: recuperar codigo de la sucursal
		 sql = "select count(1) filas from asignado ";
		sql += "where chr_emplcodigo=? and dtt_asigfechabaja is null;";
		 filas = jdbcTemplate.queryForObject(sql, Integer.class, dto.getEmpleado());
		if (filas == 0) {
			throw new RuntimeException("Codigo del empleado incorrecto.");
		}
		sql = "select chr_sucucodigo sucursal from asignado ";
		sql += "where chr_emplcodigo=? and dtt_asigfechabaja is null;";
		String sucursal = jdbcTemplate.queryForObject(sql, String.class, dto.getEmpleado());
		// Paso 2: Recuperar contador de sucursal
		sql = "update sucursal ";
		sql += "set int_sucucontcuenta = int_sucucontcuenta + 1 ";
		sql += "where chr_sucucodigo = ?";
		jdbcTemplate.update(sql, sucursal);
		sql = "select int_sucucontcuenta cont ";
		sql += "from sucursal ";
		sql += "where chr_sucucodigo = ?";
		int cont = jdbcTemplate.queryForObject(sql, Integer.class, sucursal);
		// Paso 3: Generar numero de cuenta
		String formato = "%05d";
		String cuenta = sucursal + String.format(formato, cont);
		// Paso 4: Registrar la cuenta
		sql = "insert into cuenta(chr_cuencodigo,chr_monecodigo,";
		sql += "chr_sucucodigo,chr_emplcreacuenta,chr_cliecodigo,";
		sql += "dec_cuensaldo,dtt_cuenfechacreacion,vch_cuenestado,";
		sql += "int_cuencontmov,chr_cuenclave) ";
		sql += "values(?,?,?,?,?,?,getdate(),'ACTIVO',1,?)";
		jdbcTemplate.update(sql, cuenta, dto.getMoneda(), sucursal,
				dto.getEmpleado(), dto.getCliente(), dto.getImporte(),
				dto.getClave());
		// Paso 5: Registrar el movimiento
		sql = "insert into movimiento(chr_cuencodigo,int_movinumero, ";
		sql+= "dtt_movifecha,chr_emplcodigo,chr_tipocodigo,dec_moviimporte) ";
		sql += "values(?,1,getdate(),?,'001',?)";
		jdbcTemplate.update(sql, cuenta, dto.getEmpleado(),dto.getImporte());
		dto.setCuenta(cuenta);
		return dto;		
	}
	
	
}
