package pe.edu.uni.aprendiendocolecciones.prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList();
		
		lista.add("Gustavo");
		lista.add("true");
		lista.add("5678");
		lista.add("5467.89");
		lista.add("546.78");
		
		for (Object bean : lista) {
			System.out.println(bean.toString());
		}
		
		
	}

}
