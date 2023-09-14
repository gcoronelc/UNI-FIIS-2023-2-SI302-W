package pe.edu.uni.aprendiendojava.model;

public class CursoModel {

	private static final String profesor;
	private final String curso = "Java Orientado a Objetos";
	
	/**
	 * Inicializador estatico.
	 */
	static {
		profesor = "Gustavo Coronel";
	}
	
	public static void mostrar1(){
		System.out.println("Profesor: " + profesor);
	}
	
	public void mostrar2(){
		System.out.println("Profesor: " + profesor);
		System.out.println("Curso: " + this.curso);
	}
}
