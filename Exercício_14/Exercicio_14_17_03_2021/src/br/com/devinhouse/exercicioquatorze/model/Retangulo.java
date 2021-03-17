package br.com.devinhouse.exercicioquatorze.model;

public class Retangulo {

	private double comprimento = 1;
	private double alutra = 1;

	public Retangulo(double comprimento, double alutra) {
		super();
		this.comprimento = comprimento;
		this.alutra = alutra;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = this.validarTamanho(comprimento);
	}

	public double getAlutra() {
		return alutra;
	}

	public void setAlutra(double alutra) {
		this.alutra = this.validarTamanho(alutra);
	}

	protected double validarTamanho(double tamanho) {
		if (tamanho > 0.0 && tamanho < 20.00) {
			return tamanho;
		}
		return 1;
	}

	public double calcularPerimetro() {
		return (2 * this.alutra) + (2 * this.comprimento);
	}

	public double calcularArea() {
		return this.alutra * this.comprimento;
	}

}
