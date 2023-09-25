package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.PromedioAbstract;
import pe.edu.uni.aprendiendojava.service.sista.PromedioSistAImpl;
import pe.edu.uni.aprendiendojava.service.sistb.PromedioSistBImpl;
import pe.edu.uni.aprendiendojava.service.sistc.PromedioSistCImpl;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

	public static void main(String[] args) {
		// Datos
		int pp = 8;
		int ep = 13;
		int ef = 18;
		// Proceso
		int pr1 = (new PromedioSistAImpl()).promedio(pp, ep, ef);
		int pr2 = (new PromedioSistBImpl()).promedio(pp, ep, ef);
		int pr3 = (new PromedioSistCImpl()).promedio(pp, ep, ef);
		// Reporte
		System.out.println("Promedio SistA: " + pr1);
		System.out.println("Promedio SistB: " + pr2);
		System.out.println("Promedio SistC: " + pr3);

		// Clase anónima
		PromedioAbstract bean = new PromedioAbstract() {
			@Override
			public int promedio(int pp, int ep, int ef) {
				int pr;
				pr = (pp + ep * 2 + ef * 2) / 5;
				return pr;
			}
		};

		System.out.println("Promedio SistAnonimo: " + bean.promedio(pp, ep, ef));

	}

}
