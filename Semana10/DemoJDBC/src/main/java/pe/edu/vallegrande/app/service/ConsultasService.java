package pe.edu.vallegrande.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pe.edu.vallegrande.app.bean.ClienteBean;

@Service
public class ConsultasService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int cantCuentas() {
		String sql = "select count(*) from cuenta";
		int rowCount = jdbcTemplate.queryForObject(sql, Integer.class);
		return rowCount;
	}

	public Map<String, Object> datosPorCuenta(String cuenta) {
		String sql = "select chr_cuencodigo cuenta, chr_monecodigo moneda, ";
		sql += "dec_cuensaldo saldo ";
		sql += "from cuenta where chr_cuencodigo = ?";
		Map<String, Object> rec = jdbcTemplate.queryForMap(sql, cuenta);
		return rec;
	}
	
	
	public List<ClienteBean> listaClientes(){
		String sql = "select chr_cliecodigo codigo, vch_cliepaterno paterno ";
		sql += ", vch_cliematerno materno, vch_clienombre ";
		sql += "from cliente";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(ClienteBean.class));
	}
	
}
