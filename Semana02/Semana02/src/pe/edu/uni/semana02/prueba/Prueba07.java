package pe.edu.uni.semana02.prueba;

import pe.edu.uni.semana02.dto.ProductoDto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba07 {

	public static void main(String[] args) {

		ProductoDto prod1 = new ProductoDto(200, "Laptop i9", 4500.0, true);
		System.out.println("Codigo: " + prod1.getCodigo());
		System.out.println("Nombre: " + prod1.getNombre());
		System.out.println("Precio: " + prod1.getPrecio());
		System.out.println("Disponible: " + prod1.isDisponible());

	}

}
