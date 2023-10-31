package pe.edu.vallegrande.appdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductosController {

	@GetMapping()
	public String listado() {
		return "Listado de productos";
	}
	
}
