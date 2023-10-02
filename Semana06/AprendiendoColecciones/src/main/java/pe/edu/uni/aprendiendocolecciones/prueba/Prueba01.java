package pe.edu.uni.aprendiendocolecciones.prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import pe.edu.uni.aprendiendocolecciones.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		lista.add("Gustavo");
		lista.add(true);
		lista.add(5678);
		lista.add(5467.89);
		lista.add(546.78f);
		lista.add(new Random());
		lista.add(new Producto(50, "Laptop", 6000.00));
		
		for (Object bean : lista) {
			System.out.println(bean);
		}
		
		
	}

}
