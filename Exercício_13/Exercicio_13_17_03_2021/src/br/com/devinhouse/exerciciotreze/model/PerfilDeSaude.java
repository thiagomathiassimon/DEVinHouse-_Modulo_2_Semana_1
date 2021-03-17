package br.com.devinhouse.exerciciotreze.model;

import br.com.devinhouse.exerciciotreze.util.DataAtual;

public class PerfilDeSaude {

	private String nome;
	private String sobrenome;
	private String sexo;
	private String dataDeNascimento;
	private double altura;
	private double peso;

	public PerfilDeSaude(String nome, String sobrenome, String sexo, String dataDeNascimento, double altura,
			double peso) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int retornarIdadeEmAnos() {
		int idade = 0;

		DataAtual dataAtual = new DataAtual();

		int diaAtual = Integer.parseInt(dataAtual.retornarDataAtual(0));
		int mesAtual = Integer.parseInt(dataAtual.retornarDataAtual(1));
		int anoAtual = Integer.parseInt(dataAtual.retornarDataAtual(2));

		String[] dataNascimento = this.dataDeNascimento.split("/");

		int diaNascimento = Integer.parseInt(dataNascimento[0]);
		int mesNascimento = Integer.parseInt(dataNascimento[1]);
		int anoNascimento = Integer.parseInt(dataNascimento[2]);

		if (mesAtual > mesNascimento) {
			idade = anoAtual - anoNascimento;
		} else if (mesAtual == mesNascimento) {
			if (diaAtual >= diaNascimento) {
				idade = anoAtual - anoNascimento;
			}
		} else {
			idade = (anoAtual - 1) - anoNascimento;
		}

		return idade;
	}

	public double retornarFrequenciaCardiacaMaxima() {
		double frequenciaCardiacaMaxima = 0.0;
		frequenciaCardiacaMaxima = 220 - this.retornarIdadeEmAnos();
		return frequenciaCardiacaMaxima;
	}

	public String retornarFrequenciaCardiacaAlvo() {
		double frequenciaCardiacaAlvoMaxima = 0.0;
		double frequenciaCardiacaAlvoMinima = 0.0;
		double frequenciaCardiacaMaxima = this.retornarFrequenciaCardiacaMaxima();
		frequenciaCardiacaAlvoMaxima = frequenciaCardiacaMaxima * 0.85;
		frequenciaCardiacaAlvoMinima = frequenciaCardiacaMaxima * 0.50;
		return String.format("Entre %.2f e %.2f", frequenciaCardiacaAlvoMinima, frequenciaCardiacaAlvoMaxima);
	}

	public double calcularImc() {
		return this.peso / (this.altura * this.altura);
	}

}
