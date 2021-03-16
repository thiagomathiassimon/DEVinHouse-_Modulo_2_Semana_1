package br.com.devinhouse.exercicioonze.model;

public class Funcionario {

	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;

	public Funcionario(String primeiroNome, String sobrenome, double salarioMensal) {
		super();
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.salarioMensal = isSalarioMensalPositivo(salarioMensal);
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = isSalarioMensalPositivo(salarioMensal);
	}

	private double isSalarioMensalPositivo(double salarioMensal) {
		return (salarioMensal > 0) ? salarioMensal : 0;
	}

	public double exibirSalarioAnual() {
		return this.salarioMensal * 12;
	}

	public void gerarAumento(double percentagemDoAumento) {
		this.salarioMensal += (this.salarioMensal * percentagemDoAumento);
	}

}
