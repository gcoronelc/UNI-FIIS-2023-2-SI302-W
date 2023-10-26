package pe.edu.uni.proy2_abregu.services;

import java.util.Random;

public class VectorService {

	private int[] vector3;
	private int[] vector5;
	private Random random = new Random();

	public VectorService(int n) {
		this.vector3 = new int[n];
		this.vector5 = new int[n];
		for (int i = 0; i < n; i++) {
			this.vector3[i] = (random.nextInt(13) + 4) * 3;
			this.vector5[i] = (random.nextInt(8) + 2) * 5;
		}
	}

	public int[] getVector3() {
		return this.vector3;
	}

	public int[] getVector5() {
		return this.vector5;
	}

	public int[] vectorComun() {
		int[] aux = new int[getVector3().length];
		boolean repeat = false;
		for (int i = 0; i < getVector3().length; i++) {
			for (int j = 0; j < getVector5().length; j++) {
				if (getVector3()[i] == getVector5()[j]) {
					for (int k : aux) {
						if (k == getVector5()[j]) {
							repeat = true;
							break;
						}
					}
					if (repeat == false) {
						aux[j] = getVector3()[i];
					}
					repeat = false;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != 0) {
				count++;
			}
		}
		int[] rspt = new int[count];
		count = 0;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != 0) {
				rspt[count] = aux[i];
				count++;
			}
		}
		return rspt;
	}

	public int[] vectorUnion() {
		int[] aux = new int[getVector3().length * 2];
		boolean repeat = false;
		int count = 0;
		for (int i = 0; i < getVector3().length; i++) {
			for (int j : aux) {
				if (j == getVector3()[i]) {
					repeat = true;
					break;
				}
			}
			if (repeat == false) {
				aux[count] = getVector3()[i];
				count++;
			}
			repeat = false;
		}
		for (int i = 0; i < getVector5().length; i++) {
			for (int j : aux) {
				if (j == getVector5()[i]) {
					repeat = true;
					break;
				}
			}
			if (repeat == false) {
				aux[count] = getVector5()[i];
				count++;
			}
			repeat = false;
		}
		count = 0;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != 0) {
				count++;
			}
		}
		int[] rspt = new int[count];
		count = 0;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != 0) {
				rspt[count] = aux[i];
				count++;
			}
		}
		return rspt;
	}

}
