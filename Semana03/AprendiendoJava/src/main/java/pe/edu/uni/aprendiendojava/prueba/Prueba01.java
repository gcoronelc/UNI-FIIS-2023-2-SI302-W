package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService;

public class Prueba01 {
	
	public static void main(String[] args) {
		
		MateService service = new MateService();
		System.out.println("7 + 8: " + service.sumar(0x70, 0x50));
		
	}
	
}
