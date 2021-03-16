package exercicio7;

public class TestaConta {

	public static void main(String[] args) {

		ContaBancaria minhaConta = new ContaBancaria();

		minhaConta.setNome("Thiago Mathias Simon");
		minhaConta.setNumero(001);
		minhaConta.setAgencia(123);
		minhaConta.setDataDeAbertura("21/02/1999");

		minhaConta.emitirDadosDaConta();

		minhaConta.depositar(500.00);

		minhaConta.emitirDadosDaConta();

		minhaConta.sacar(150.00);

		minhaConta.emitirDadosDaConta();

	}

}
