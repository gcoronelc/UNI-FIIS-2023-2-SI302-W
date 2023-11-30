package pe.edu.uni.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String sql_select_base;
	
	static {
		sql_select_base = "select chr_cliecodigo codigo, vch_cliepaterno paterno,";
		sql_select_base += "vch_cliematerno materno, vch_clienombre nombre,";
		sql_select_base += "chr_cliedni dni, vch_clieciudad ciudad,";
		sql_select_base += "vch_cliedireccion direccion, vch_clietelefono telefono,";
		sql_select_base += "vch_clieemail email ";
		sql_select_base += "from cliente ";
	}
	
	
	public List<Map<String, Object>> getClientes(){
		return jdbcTemplate.queryForList(sql_select_base); 
	}
	
	public List<Map<String, Object>> getClientes
	(String paterno, String materno, String nombre){
		String sql = sql_select_base;
		sql += "where vch_cliepaterno like ? ";
		sql += "and vch_cliematerno like ? ";
		sql += "and vch_clienombre like ? ";
		paterno = "%" + paterno + "%";
		materno = "%" + materno + "%";
		nombre = "%" + nombre + "%";
		return jdbcTemplate.queryForList(sql, paterno, materno, nombre); 
	}
	
	

}
