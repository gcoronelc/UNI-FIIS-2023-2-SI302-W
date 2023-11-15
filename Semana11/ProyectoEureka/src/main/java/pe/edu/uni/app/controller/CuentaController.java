package pe.edu.uni.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.uni.app.dto.CuentaDto;
import pe.edu.uni.app.dto.MensajeDto;
import pe.edu.uni.app.service.CuentaService;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {
	
	@Autowired
	private CuentaService cuentaService;

	@PostMapping("/crear")
	public MensajeDto crearCuenta(@RequestBody CuentaDto dto) {
		MensajeDto mensaje = null; new MensajeDto(1, "Proceso ok." );
		try {
			dto = cuentaService.crearCuenta(dto);
			mensaje = new MensajeDto(1,"Cuenta creada: " + dto.getCuenta());
		} catch (Exception e) {
			mensaje = new MensajeDto(-1, "Error: " + e.getMessage());
		}
		return mensaje;
	}
	
	
}
