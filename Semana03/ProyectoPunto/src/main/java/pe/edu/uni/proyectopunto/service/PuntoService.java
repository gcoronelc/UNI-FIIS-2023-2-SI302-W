package pe.edu.uni.proyectopunto.service;

import java.util.Random;

public class PuntoService {

	private int x;
	private int y;

	public PuntoService() {
		Random random = new Random();
		this.x = random.nextInt(50)*(random.nextInt(50)%2==1?1:-1);
		this.y = random.nextInt(50)*(random.nextInt(50)%2==1?1:-1);
	}

	public PuntoService(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
	public String getCuadrante(){
		String rpta = "No sé";
		// Inicio del proceso
		rpta = (x > 0 && y > 0)?"Primer cuadrante":rpta;
		rpta = (x < 0 && y > 0)?"Segundo cuadrante":rpta;
		rpta = (x < 0 && y < 0)?"Tercer cuadrante":rpta;
		rpta = (x > 0 && y < 0)?"Cuarto cuadrante":rpta;
		// Fin del proceso
		return rpta;
	}
	
	public double getDistancia(){
		double distancia;
		// Inicio proceso
		distancia = Math.sqrt(x*x + y*y);
		// Fin de proceso
		return distancia;
	}
	

	
}
