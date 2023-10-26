package pe.edu.uni.proy1_abregu.pruebas;

import pe.edu.uni.proy1_abregu.services.MateService;

public class PruebaSerie {

	public static void main(String[] args) {
		//Creacion
		MateService test = new MateService();
		//Verificacion de funciones
		double x = 1;
		System.out.println("\tx\tn\tserie");
		for (int n = 0; n <= 5; n++) {
			double s = test.CalculateSerie(n, x);
			System.out.println("\t" + x + "\t" + n + "\t" + s);
		}

	}
}
