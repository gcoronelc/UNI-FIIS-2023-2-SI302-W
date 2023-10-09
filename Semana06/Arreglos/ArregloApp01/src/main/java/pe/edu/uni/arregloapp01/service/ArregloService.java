package pe.edu.uni.arregloapp01.service;

import java.util.Arrays;
import java.util.Random;

public final class ArregloService {

	private int n;
	private int[] arreglo;
	private int[] pares;
	private int[] impares;

	/**
	 * Constructor unico con el valor de "n" como parametro.
	 * @param n Tamaño del arreglo.
	 */
	public ArregloService(int n) {
		this.n = n;
		this.arreglo = new int[n]; // Crea el arreglo
		generaDatos(); // Genera los datos.
	}

	/**
	 * Genera los datos del arreglo.
	 */
	public void generaDatos() {
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			arreglo[i] = random.nextInt(16) + 15;
		}
	}

	public int[] getArreglo() {
		return arreglo;
	}

	public int[] obtenerArregloPares(){
		int cantPares = contadorPares();
		pares = new int[cantPares];
		int i = 0;
		for (int dato : arreglo) {
			if(dato%2 == 0){
				pares[i] = dato;
				i++;
			}
		}
		return pares;
	}

	private int contadorPares() {
		int contador = 0;
		for (int dato : arreglo) {
			contador += (dato%2==0?1:0);
		}
		return contador;
	}
	
	public int sumaPares(){
		int suma = 0;
		for (int dato : pares) {
			suma += dato;
		}
		return suma;
	}

	public int[] obtenerArregloImpares() {
		int cantImpares = arreglo.length - contadorPares();
		impares = new int[cantImpares];
		int i = 0;
		for (int dato : arreglo) {
			if(dato%2 == 1){
				impares[i] = dato;
				i++;
			}
		}
		return impares;
	}

	public int sumaArreglo() {
		return Arrays.stream(arreglo).sum();
	}

	public int sumaImpares() {
		return Arrays.stream(impares).sum();
	}
}
