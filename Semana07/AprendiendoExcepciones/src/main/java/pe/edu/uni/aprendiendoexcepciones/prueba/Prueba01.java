package pe.edu.uni.aprendiendoexcepciones.prueba;

import pe.edu.uni.aprendiendoexcepciones.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

	public static void main(String[] args) {
		try {
			// Datos
			int n1 = 40;
			int n2 = 0;
			// Proceso
			MateService service = new MateService();
			int n3 = service.dividir(n1, n2);
			// Reporte
			System.out.println("n3 = " + n3);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally{
			System.out.println("Fin del programa");
		}
	}

}
