package pe.edu.uni.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.uni.app.dto.ComboDto;
import pe.edu.uni.app.service.ComboService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/combos")
public class ComboController {

	@Autowired
	private ComboService comboService;
	
	@GetMapping("/monedas")
	public List<ComboDto> getMonedas(){
		return comboService.getMonedas();
	}
	
	@GetMapping("/clientes")
	public List<ComboDto> getClientes(){
		return comboService.getClientes();
	}
	
}
