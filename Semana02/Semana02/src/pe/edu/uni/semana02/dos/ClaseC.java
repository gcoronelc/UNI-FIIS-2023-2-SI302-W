package pe.edu.uni.semana02.dos;

import pe.edu.uni.semana02.uno.ClaseA;

/**
 *
 * @author Gustavo Coronel
 */
public class ClaseC extends ClaseA{
	
	public void metodoC(){
		ClaseA obj = new ClaseA();
		//System.out.println("n1: " + obj.n1);
		//System.out.println("n2: " + obj.n2);
		System.out.println("n3: " + super.n3);
		System.out.println("n4: " + obj.n4);
	}

}
