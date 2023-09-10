package pe.edu.uni.proyectosueldo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Gustavo Coronel
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class SueldoDto {

	// Datos de entrada
	private int horasDia;
	private int dias;
	private double pagoHora;
	// Datos de salida
	private double ingresos;
	private double renta;
	private double neto;

}
