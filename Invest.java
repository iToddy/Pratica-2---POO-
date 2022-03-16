package pratica2;

public class Invest {

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


	public void showInvest() {
		
	}

}
