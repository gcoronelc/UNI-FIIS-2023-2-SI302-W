package pe.edu.uni.proyectopunto.prueba;

import pe.edu.uni.proyectopunto.service.PuntoService;

public class Prueba01 {

	public static void main(String[] args) {
		
		PuntoService punto = new PuntoService();
		
		System.out.println("X: " + punto.getX());
		System.out.println("Y: " + punto.getY());
		System.out.println("Cuadrante: " + punto.getCuadrante());
		System.out.println("Distancia: " + punto.getDistancia());
	}
}
