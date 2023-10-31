package pe.edu.vallegrande.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import pe.edu.vallegrande.app.bean.ClienteBean;
import pe.edu.vallegrande.app.service.ConsultasService;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {

	@Autowired
	private ConsultasService consultasService;
	
	@GetMapping("/cantcuentas")
	public int cantCuentas() {
		return consultasService.cantCuentas();
	}
	
	@GetMapping("/cuenta/{cuenta}")
	public Map<String,Object> datosPorCuenta(@PathVariable String cuenta){
		return consultasService.datosPorCuenta(cuenta);
	}
	
	@GetMapping("/clientes")
	public List<ClienteBean> listaClientes(){
		return consultasService.listaClientes();
	}
}
