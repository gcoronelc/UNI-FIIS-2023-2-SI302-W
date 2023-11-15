package pe.edu.uni.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.uni.app.dto.VentaDto;
import pe.edu.uni.app.service.VentaService;

@RestController
@RequestMapping("venta")
public class VentaRest {
	
	@Autowired
	private VentaService service;
	
	@PostMapping()
	public VentaDto procesar(@RequestBody VentaDto dto) {
		return service.procesar(dto); 
	}
	
}
