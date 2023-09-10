package pe.edu.uni.proyectosueldo.prueba;

import pe.edu.uni.proyectosueldo.dto.SueldoDto;
import pe.edu.uni.proyectosueldo.service.SueldoService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		// Datos
		SueldoDto dto = new SueldoDto();
		dto.setHorasDia(6);
		dto.setDias(20);
		dto.setPagoHora(120.0);
		// Proceso
		SueldoService service = new SueldoService();
		dto = service.procesarSueldo(dto);
		// Reporte
		System.out.println("Ingresos: " + dto.getIngresos());
		System.out.println("Renta: " + dto.getRenta());
		System.out.println("Neto: " + dto.getNeto());
	}

}
