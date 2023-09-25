package pe.edu.uni.aprendiendojava.service.sista;

import pe.edu.uni.aprendiendojava.service.PromedioAbstract;

/**
 *
 * @author Gustavo Coronel
 */
public class PromedioSistAImpl extends PromedioAbstract{

	@Override
	public int promedio(int pp, int ep, int ef) {
		int pr;
		pr = (pp + ep + ef)/3;
		return pr;
	}

}
