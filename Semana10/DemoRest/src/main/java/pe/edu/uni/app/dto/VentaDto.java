package pe.edu.uni.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class VentaDto {
	
	private double precio;
	private int cantidad;
	private double importe;
	private double impuesto;
	private double total;

}
