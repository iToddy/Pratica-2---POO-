package pratica2;

import java.util.Scanner;

public class Invest {
	
	Scanner entrada = new Scanner(System.in);

	int inicialInvest;
	float taxa;
	int numMeses;
	
	public Rendimento(int inicialInvest, float taxa, int numMeses) {
		this.inicialInvest = inicalInvest;
		this.taxa = taxa;
		this.numMeses = numMeses;
}

	public int getInicialInvest() {
		return inicialInvest;
	}

	public void setInicialInvest(int inicialInvest) {
		this.inicialInvest = inicialInvest;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public int getNumMeses() {
		return numMeses;
	}

	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}


	public float showInvest() {
		
		float finalInvest = this.inicialInvest;
		for (int i = 0; i < this.numMeses; i++) {
			finalInvest = finalInvest + (finalInvest * this.taxa);
		}
		
		return finalInvest;
		
		
	}

}
