package pe.edu.uni.app.rest;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.uni.app.dto.MateDto;

@RestController
public class AppRest {
	
	@GetMapping
	public String holaMundo() {
		return "Hola Mundo";
	}
	
	@PostMapping("sumar")
	public String sumar(@RequestBody Map<String, Integer> datos) {
		int n1 = datos.get("n1").intValue();
		int n2 = datos.get("n2").intValue();
		int suma = n1 + n2;
		String rpta = "Suma: " + suma;
		return rpta;
	}
	
	@PostMapping("sumar2")
	public MateDto sumar2(@RequestBody MateDto dto) {
		dto.setSuma(dto.getN1() + dto.getN2());
		dto.setResta(dto.getN1() - dto.getN2());
		return dto;
	}

}
