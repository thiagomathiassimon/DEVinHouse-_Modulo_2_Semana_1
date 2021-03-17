package br.com.devinhouse.exerciciodoze.model;

import br.com.devinhouse.exerciciodoze.util.DataAtual;

public class FrequenciaCardiaca {

	private String nomeDaPessoa;
	private String sobrenomeDaPessoa;
	private String dataDeNascimentoDaPessoa;

	public FrequenciaCardiaca(String nome, String sobrenome, String dataDeNascimento) {
		this.nomeDaPessoa = nome;
		this.sobrenomeDaPessoa = sobrenome;
		this.dataDeNascimentoDaPessoa = dataDeNascimento;
	}

	public String getNomeDaPessoa() {
		return nomeDaPessoa;
	}

	public void setNomeDaPessoa(String nomeDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
	}

	public String getSobrenomeDaPessoa() {
		return sobrenomeDaPessoa;
	}

	public void setSobrenomeDaPessoa(String sobrenomeDaPessoa) {
		this.sobrenomeDaPessoa = sobrenomeDaPessoa;
	}

	public String getDataDeNascimentoDaPessoa() {
		return dataDeNascimentoDaPessoa;
	}

	public void setDataDeNascimentoDaPessoa(String dataDeNascimentoDaPessoa) {
		this.dataDeNascimentoDaPessoa = dataDeNascimentoDaPessoa;
	}

	public int retornarIdadeEmAnos() {
		int idade = 0;

		DataAtual dataAtual = new DataAtual();

		int diaAtual = Integer.parseInt(dataAtual.retornarDataAtual(0));
		int mesAtual = Integer.parseInt(dataAtual.retornarDataAtual(1));
		int anoAtual = Integer.parseInt(dataAtual.retornarDataAtual(2));

		String[] dataNascimento = this.dataDeNascimentoDaPessoa.split("/");

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

}
