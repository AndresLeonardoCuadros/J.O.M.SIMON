package co.edu.unbosque.model;

public class Numeros extends Resultados implements Logica {
	boolean bandera;
	public int r[] = new int[4];
	public int[] aux = new int[4];

	public Numeros(boolean bandera) {
		super(bandera);
		this.bandera = bandera;
		
	}

	public int [] numeroRandom() {
	 int x = 0;
	 while (x<4) {
		 r[x] = (int) (Math.random()*4+1);
		 x++;
	 }
	 return r;
	}

	public boolean comparar() {
		 bandera = true;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != r[i]) {
				bandera = false;
			}
		}

		return bandera;
	}
	public int devolverValor(int n) {
		return r[n];
	}

	public int[] getR() {
		return r;
	}

	public void setR(int[] r) {
		this.r = r;
	}

	public int[] getAux() {
		return aux;
	}

	public void setAux(int[] aux) {
		this.aux = aux;
	}
	
}
