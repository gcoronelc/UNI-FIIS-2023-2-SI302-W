package pe.edu.uni.aprendiendoexcepciones.service;

/**
 *
 * @author Gustavo Coronel
 */
public class MateService {
	
	public int dividir(int n1, int n2) {
		if(n2==0){
			throw new RuntimeException("No se puede dividir entre cero.");
		}
		return (n1/n2);
	}
	

}
