package pe.edu.vallegrande.app.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ClienteBean {

	private String codigo;
	private String paterno;
	private String materno;
	private String nombre;
	private String dni;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String email;
	
}
