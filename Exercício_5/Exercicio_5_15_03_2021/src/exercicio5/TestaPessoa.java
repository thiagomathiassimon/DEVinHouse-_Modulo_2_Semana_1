package exercicio5;

public class TestaPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Thiago Mathias Simon");

		pessoa.setIdade(18);

		System.out.printf("Nome: %s%nIdade: %d", pessoa.getNome(), pessoa.getIdade());

		pessoa.fazAniversario();

		System.out.printf("%nNome: %s%nIdade: %d", pessoa.getNome(), pessoa.getIdade());

	}

}
