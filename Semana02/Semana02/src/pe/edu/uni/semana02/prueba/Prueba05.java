package pe.edu.uni.semana02.prueba;

import pe.edu.uni.semana02.dto.ProductoDto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

	public static void main(String[] args) {

		ProductoDto prod1 = new ProductoDto();

		prod1.setCodigo(2000);
		prod1.setNombre("Televisor");
		prod1.setPrecio(2500.00);
		prod1.setDisponible(true);

		System.out.println("Codigo: " + prod1.getCodigo());
		System.out.println("Nombre: " + prod1.getNombre());
		System.out.println("Precio: " + prod1.getPrecio());
		System.out.println("Disponible: " + prod1.isDisponible());

	}

}
