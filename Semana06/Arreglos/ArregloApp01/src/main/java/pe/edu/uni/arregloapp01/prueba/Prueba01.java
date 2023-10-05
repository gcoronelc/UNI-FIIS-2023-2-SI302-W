package pe.edu.uni.arregloapp01.prueba;

import pe.edu.uni.arregloapp01.service.ArregloService;

public class Prueba01 {
	
	public static void main(String[] args) {
		
		// Datos
		int n = 10;
		
		// Proceso
		ArregloService service = new ArregloService(n);
		int[] arreglo = service.getArreglo();
		int[] pares = service.obtenerArregloPares();
		int sumaPares = service.sumaPares();
		
		// Reporte 1
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		// Reporte 2
		System.out.println("-----------------------------");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]);
			System.out.print((i<(n-1)?",":""));
		}
		System.out.println("");
		
		// Reporte de pares
		for (int dato : pares) {
			System.out.print(dato + " ");
		}
		System.out.println("\nSuma de pares: " + sumaPares);
	}

}
