package pe.ld.ventas.entity;

public class Producto {

	private int idprod;
	private int idcat;
	private String nombre;
	private double precio;
	private int stock;

	public Producto() {
	}

	public Producto(int idprod, int idcat, String nombre, double precio, int stock) {
		this.idprod = idprod;
		this.idcat = idcat;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public int getIdcat() {
		return idcat;
	}

	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}

	public int getIdprod() {
		return idprod;
	}

	public void setIdprod(int idprod) {
		this.idprod = idprod;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
