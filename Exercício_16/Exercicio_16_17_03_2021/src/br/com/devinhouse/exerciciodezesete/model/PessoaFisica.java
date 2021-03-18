package br.com.devinhouse.exerciciodezesete.model;

public class PessoaFisica {

	private String nome;
	private String sobrenome;
	private String cpf;
	private String dataDeNascimento;
	private String nomeDaMae;

	public PessoaFisica(String nome, String sobrenome, String cpf, String dataDeNascimento, String nomeDaMae) {
		if (!this.validarCpf(cpf)) {
		} else {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.cpf = cpf;
			this.dataDeNascimento = dataDeNascimento;
			this.nomeDaMae = nomeDaMae;
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return this.dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNomeDaMae() {
		return this.nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public boolean validarCpf(String cpf) {
		int validadorDeCpf[] = new int[11];
		int primeiroDigitoVerificador = 0;
		int segundoDigitoVerificador = 0;
		int variavelDeControle = 0;
		boolean cpfEValido = false;

		if (cpf.isEmpty() || cpf.length() > 11) {
			return cpfEValido;
		}

		for (int i = 0; i < cpf.length(); i++) {
			validadorDeCpf[i] = (int) (cpf.charAt(i) - '0');
		}

		for (int i = 10; i >= 2; i--) {
			primeiroDigitoVerificador += validadorDeCpf[variavelDeControle] * i;
			variavelDeControle++;
		}

		primeiroDigitoVerificador = (primeiroDigitoVerificador * 10) % 11;

		if (primeiroDigitoVerificador == 10) {
			primeiroDigitoVerificador = 0;
		}

		if (primeiroDigitoVerificador != validadorDeCpf[9]) {
			return cpfEValido;
		} else {
			variavelDeControle = 0;

			for (int i = 11; i >= 2; i--) {
				segundoDigitoVerificador += validadorDeCpf[variavelDeControle] * i;
				variavelDeControle++;
			}

			segundoDigitoVerificador = (segundoDigitoVerificador * 10) % 11;

			if (segundoDigitoVerificador == 10) {
				segundoDigitoVerificador = 0;
			}

			if (segundoDigitoVerificador != validadorDeCpf[10]) {
				return cpfEValido;
			} else {
				cpfEValido = true;
			}
		}
		return cpfEValido;
	}
}
