package pe.edu.uni.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CuentaDto {

	private String cuenta;
	private String cliente;
	private String empleado;
	private String moneda;
	private Double importe;
	private String clave;
	
	
	
}
