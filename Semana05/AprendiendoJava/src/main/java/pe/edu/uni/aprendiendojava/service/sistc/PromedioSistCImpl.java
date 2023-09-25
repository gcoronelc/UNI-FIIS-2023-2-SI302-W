package pe.edu.uni.aprendiendojava.service.sistc;

import pe.edu.uni.aprendiendojava.service.PromedioAbstract;

/**
 *
 * @author Gustavo Coronel
 */
public class PromedioSistCImpl extends PromedioAbstract {

	@Override
	public int promedio(int pp, int ep, int ef) {
		int pr;
		pr = (pp + ep + ef * 2) / 4;
		return pr;
	}

}
