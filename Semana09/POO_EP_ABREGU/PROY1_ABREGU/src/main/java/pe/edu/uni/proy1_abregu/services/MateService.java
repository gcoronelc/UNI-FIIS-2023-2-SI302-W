package pe.edu.uni.proy1_abregu.services;

public class MateService {

	// Para los numeros Perfectos
	public String CalculatePerfect(int num1) {
		int num2 = 0;
		for (int i = 1; i <= num1 / 2; i++) {
			if (num1 % i == 0) {
				num2 += i;
			}
		}
		return (num2 == num1) ? "Si es un numero perfecto" : "No es un numero perfecto";
	}

	// Para los numeros amigos
	public String CalculateAmigos(int n1, int n2) {
		int aux1 = sumaDigitos(n1);
		int aux2 = sumaDigitos(n2);
		String rpta = (aux1 == n2 && aux2 == n1) ? "Son numeros amigos" : "No son amigos";
		return rpta;
	}
	
	private int sumaDigitos(int num) {
		int suma = 0;
		for (int i = 1; i <= num / 2; i++) {
			suma += (num % i == 0) ? i : 0;
		}
		return suma;
	}
	
	// Para la serie
	public double CalculateSerie(int n, double x) {
		double result = 0;
		for (int i = 0; i <= n; i++) {
			result += (Math.pow(-1, i) * Math.pow(x, 2 * i + 1)) / (2 * i + 1);
		}
		return result;
	}

}
