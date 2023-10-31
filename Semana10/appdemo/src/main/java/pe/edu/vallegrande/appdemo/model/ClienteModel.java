package pe.edu.vallegrande.appdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ClienteModel {

	private int id;
	private String nombre;
	private String ruc;
	private String correo;
	
	public ClienteModel(String nombre, String ruc, String correo) {
		super();
		this.nombre = nombre;
		this.ruc = ruc;
		this.correo = correo;
	}

	

}
