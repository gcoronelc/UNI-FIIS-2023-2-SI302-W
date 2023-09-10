package pe.edu.uni.semana02.dto;

/**
 *
 * @author Gustavo Coronel
 */
public class ProductoDto {

	private int codigo;
	private String nombre;
	private double precio;
	private boolean disponible;

	/**
	 * Constructor por defecto.
	 */
	public ProductoDto() {
		this.codigo = 6000;
		this.nombre = "Auto Modelo 2023";
		this.precio = 20000.00;
		this.disponible = true;
		System.out.println("Objeto creado.");
	}

	/**
	 * Constructor adicional.
	 * 
	 * @param codigo Codigo del producto.
	 * @param nombre Nombre del producto.
	 * @param precio Precio del producto.
	 * @param disponible Disponibilidad del producto.
	 */
	public ProductoDto(int codigo, String nombre, double precio, boolean disponible) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	protected void finalize() throws Throwable {
		System.err.println("Chau objeto.");
	}

	
	
}
