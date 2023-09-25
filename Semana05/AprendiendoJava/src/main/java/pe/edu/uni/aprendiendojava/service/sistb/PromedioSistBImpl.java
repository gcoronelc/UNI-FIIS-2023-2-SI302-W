package pe.edu.uni.aprendiendojava.service.sistb;

import pe.edu.uni.aprendiendojava.service.PromedioAbstract;

/**
 *
 * @author Gustavo Coronel
 */
public class PromedioSistBImpl extends PromedioAbstract{

	@Override
	public int promedio(int pp, int ep, int ef) {
		int pr;
		pr = (pp * 2 + ep + ef) / 4;
		return pr;
	}

}
