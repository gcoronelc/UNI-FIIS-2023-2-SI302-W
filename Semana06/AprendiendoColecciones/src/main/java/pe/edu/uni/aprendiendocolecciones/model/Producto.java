package pe.edu.uni.aprendiendocolecciones.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Producto {
	
	private int id;
	private String nombre;
	private double precio;

	public Producto() {
	}

	public Producto(int id, String nombre, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		String texto = "[";
		texto += "id:" + id;
		texto += ",nombre:" + nombre;
		texto += ",precio:" + precio + "]";
		return texto;
	}
	
	

}
