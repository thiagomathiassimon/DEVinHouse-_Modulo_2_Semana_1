package exercicio6;

public class Porta {

	private String cor;
	private double largura;
	private double altura;
	private double profundidade;
	private boolean aberta = false;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	boolean estaAberta() {
		if (this.aberta == true) {
			return true;
		}
		return false;
	}

	boolean abre() {
		if (this.estaAberta()) {
			return false;
		}
		this.aberta = true;
		return true;
	}

	boolean fecha() {
		if (!this.estaAberta()) {
			return false;
		}
		this.aberta = false;
		return true;
	}

	void pinta(String cor) {
		this.cor = cor;
	}

}
