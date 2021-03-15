package exercicio5;

public class Pessoa {

	private String nome;
	private int idade;

	String getNome() {
		return this.nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	int getIdade() {
		return this.idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	void fazAniversario() {
		this.idade++;
	}

}
