package exercicio8;

public class TestaConta {

	public static void main(String[] args) {

		ContaBancaria minhaConta = new ContaBancaria();

		minhaConta.setNome("Thiago Mathias Simon");
		minhaConta.setNumero(001);
		minhaConta.setAgencia(123);
		minhaConta.setDataDeAbertura("21/02/1999");

		System.out.println(minhaConta.recuperaDadosParaImpressao());

		minhaConta.depositar(500.00);

		System.out.println(minhaConta.recuperaDadosParaImpressao());

		minhaConta.sacar(150.00);

		System.out.println(minhaConta.recuperaDadosParaImpressao());

	}

}
