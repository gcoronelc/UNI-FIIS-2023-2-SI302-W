package pe.edu.uni.aprendiendojava.model;

public class ProductoModel {

	private int codigo;
	private String nombre;
	private double precio;

	/**
	 * Constructor por defecto.
	 */
	public ProductoModel() {
		this.codigo = 200;
		this.nombre = "Televisor";
		this.precio = 856.34;
	}

	/**
	 * Constructor adicional.
	 * @param codigo Codigo del producto.
	 * @param nombre Nombre del producto.
	 * @param precio Precio del producto.
	 */
	public ProductoModel(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public void mostrarProducto(){
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Precio: " + this.precio);
	}
	
	

	
}
