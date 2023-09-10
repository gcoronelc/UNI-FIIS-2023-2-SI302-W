package pe.edu.uni.proyectosueldo.service;

import pe.edu.uni.proyectosueldo.dto.SueldoDto;

/**
 *
 * @author Gustavo Coronel
 */
public class SueldoService {
	
	public SueldoDto procesarSueldo(SueldoDto dto){
		// Proceso
		double ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
		double renta = (ingresos>1500)?ingresos*0.08:0.0;
		double neto = ingresos - renta;
		// Reporte
		dto.setIngresos(ingresos);
		dto.setRenta(renta);
		dto.setNeto(neto);
		return dto;
	}

}
