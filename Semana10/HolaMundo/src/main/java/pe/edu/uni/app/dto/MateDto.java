package pe.edu.uni.app.dto;

public class MateDto {

	private int n1;
	private int n2;
	private int suma;
	private int resta;

	public MateDto() {
	}

	public MateDto(int n1, int n2) {	
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getSuma() {
		return suma;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

	public int getResta() {
		return resta;
	}

	public void setResta(int resta) {
		this.resta = resta;
	}

}
