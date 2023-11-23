package pe.edu.uni.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.uni.app.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> getClientes(){
		return clienteService.getClientes();
	}
	
	@GetMapping
	public List<Map<String, Object>> getClientes
	(String paterno, String materno, String nombre){
		//String paterno = parms.get("paterno").toString();
		//String materno = parms.get("materno").toString();
		//String nombre = parms.get("nombre").toString();
		return clienteService.getClientes(paterno,materno,nombre);
	}
	
}
