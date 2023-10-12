package pe.edu.uni.aprendiendoexcepciones.controller;

import pe.edu.uni.aprendiendoexcepciones.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class MateController {

	public int dividir(int n1, int n2) {
		MateService service = new MateService();
		return service.dividir(n1, n2);
	}
}
