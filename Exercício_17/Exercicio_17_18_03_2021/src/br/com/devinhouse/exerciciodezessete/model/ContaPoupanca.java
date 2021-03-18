package br.com.devinhouse.exerciciodezessete.model;

public class ContaPoupanca {

	private static double taxaDeJurosAnual;

	private double saldo;

	public ContaPoupanca(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void calcularJuroMensal() {
		this.saldo += saldo * (taxaDeJurosAnual / 12);
	}

	public static void alterarTaxaAnual(double novoValorDaTaxaDeJuros) {
		taxaDeJurosAnual = novoValorDaTaxaDeJuros;
	}

}
