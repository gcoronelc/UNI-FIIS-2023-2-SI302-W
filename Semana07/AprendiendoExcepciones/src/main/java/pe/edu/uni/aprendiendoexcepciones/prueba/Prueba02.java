package pe.edu.uni.aprendiendoexcepciones.prueba;

import pe.edu.uni.aprendiendoexcepciones.controller.MateController;
import pe.edu.uni.aprendiendoexcepciones.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

	public static void main(String[] args) {
		try {
			// Datos
			int n1 = 40;
			int n2 = 0;
			// Proceso
			MateController controller = new MateController();
			int n3 = controller.dividir(n1, n2);
			// Reporte
			System.out.println("n3 = " + n3);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Fin del programa");
		}
	}

}
