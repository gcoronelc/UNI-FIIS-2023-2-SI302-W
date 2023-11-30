package pe.edu.uni.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pe.edu.uni.app.dto.ComboDto;

@Service
public class ComboService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<ComboDto> getMonedas(){
		String sql = "select chr_monecodigo code, ";
		sql += "vch_monedescripcion label ";
		sql += "from moneda ";
		return jdbcTemplate.query(sql, 
				new BeanPropertyRowMapper<ComboDto>(ComboDto.class));
	}
	
	public List<ComboDto> getClientes(){
		String sql = "select chr_cliecodigo code,";
				sql += "concat(vch_cliepaterno,' ',";
				sql +=  "vch_cliematerno,', ',";
				sql += "vch_clienombre) label "
				+ "from Cliente";
		return jdbcTemplate.query(sql, 
				new BeanPropertyRowMapper<ComboDto>(ComboDto.class));
	}
}
