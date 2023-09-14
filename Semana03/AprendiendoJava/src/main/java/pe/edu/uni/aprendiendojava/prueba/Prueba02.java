package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.model.ProductoModel;

public class Prueba02 {
	
	public static void main(String[] args) {
		
		ProductoModel prod1 = new ProductoModel();
		prod1.mostrarProducto();
		
		ProductoModel prod2;
		prod2 = new ProductoModel(1000, "Laptop", 4580.0);
		prod2.mostrarProducto();
		
	}
	
}
