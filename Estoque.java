package pratica2;

public class Estoque {

	String nome;
	int qtdAtual;
	int qtdMin;
	
	public Estoque (String nome, int qtdAtual, int qtdMin) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMin = qtdMin;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMin() {
		return qtdMin;
	}

	public void setQtdMin(int qtdMin) {
		this.qtdMin = qtdMin;
	}
	
	
	
	public void darBaixa(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	
	public String mostra() {
		return "Nome do produto =" + nome + "Quantidadedo produto =" + qtdAtual + "Quantidade Mínima = " + qtdMin;
		
	}
	
	public boolean presaRepor() {
		if (qtdAtual <= qtdMin) {
			return true;
		} else {
			return false;
		}
	}
}
