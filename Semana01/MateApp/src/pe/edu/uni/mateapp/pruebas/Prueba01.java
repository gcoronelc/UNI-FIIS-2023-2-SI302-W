package pe.edu.uni.mateapp.pruebas;

import pe.edu.uni.mateapp.service.MateService;


/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
	
	public static void main(String[] args) {
	
		// Variables
		int n1, n2, suma;
		// Datos
		n1 = 87;
		n2 = 56;
		// Proceso
		MateService service = new MateService();
		suma = service.sumar(n1, n2);
		// Reporte
		System.out.println("Num1: " + n1);
		System.out.println("Num2: " + n2);
		System.out.println("Suma: " + suma);
		
	}

}
