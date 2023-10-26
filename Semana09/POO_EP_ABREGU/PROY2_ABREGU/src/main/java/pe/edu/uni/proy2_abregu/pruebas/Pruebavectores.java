package pe.edu.uni.proy2_abregu.pruebas;

import java.util.Arrays;
import pe.edu.uni.proy2_abregu.services.VectorService;

public class Pruebavectores {

	public static void main(String[] args) {
		// Modifique el "n" del constructor
		VectorService test = new VectorService(5);
		// Primer Vector
		System.out.println("Primer vector: " + Arrays.toString(test.getVector3()));
		// Segundo Vector
		System.out.println("Segundo vector: " + Arrays.toString(test.getVector5()));
		// Vector Union
		System.out.println("Vector Union: " + Arrays.toString(test.vectorUnion()));
		// Vector Comun
		System.out.println("Vector Comun: " + Arrays.toString(test.vectorComun()));
	}
}
