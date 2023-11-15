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
	
	public List<Map<String, Object>> getClientes(){
		String sql = "select chr_cliecodigo codigo, vch_cliepaterno paterno,";
		sql += "vch_cliematerno materno, vch_clienombre nombre,";
		sql += "chr_cliedni dni, vch_clieciudad ciudad,";
		sql += "vch_cliedireccion direccion, vch_clietelefono telefono,";
		sql += "vch_clieemail email ";
		sql += "from cliente";
		return jdbcTemplate.queryForList(sql); 
	}

}
