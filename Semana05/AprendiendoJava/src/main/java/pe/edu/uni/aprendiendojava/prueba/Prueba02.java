package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.Mujer;
import pe.edu.uni.aprendiendojava.service.Persona;

/**
 *
 * @author PCH
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		Persona obj1 = new Mujer();
		obj1.respirar();
		
		Mujer obj2 = (Mujer) obj1;
		obj2.respirar();
		obj2.reglar();
	}
	
}
