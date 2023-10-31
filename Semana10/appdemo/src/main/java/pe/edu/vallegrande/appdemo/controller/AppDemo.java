package pe.edu.vallegrande.appdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppDemo {
	
	@GetMapping("/saludo")
	public String saludo() {
		return "Hola Gustavo";
	}

}
