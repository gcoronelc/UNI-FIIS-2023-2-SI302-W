package pe.edu.uni.educaapp.controller;

import pe.edu.uni.educaapp.dto.EmpleadoDto;
import pe.edu.uni.educaapp.service.LogonService;
import pe.edu.uni.educaapp.util.Session;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class LogonController {
	
	public void validarUsuario(String usuario, String clave){
		LogonService service = new LogonService();
		EmpleadoDto dto = service.validarUsuario(usuario, clave);
		Session.put("USUARIO", dto);
	}

}
