package exercicio7;

public class ContaBancaria {

	private String nomeDoTitular;
	private int numero;
	private int agencia;
	private double saldo;
	private String dataDeAbertura;

	public String getNome() {
		return this.nomeDoTitular;
	}

	public void setNome(String nome) {
		this.nomeDoTitular = nome;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getDataDeAbertura() {
		return this.dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public boolean sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public double verificaSaldo() {
		return this.saldo;
	}

	public void emitirDadosDaConta() {
		System.out.format(
				"	Dados da conta:%nNome do titular: %s%nNúmero da conta: %d%nAgência: %d%nData de abertura: %s%nSaldo: R$%.2f%n%n",
				this.getNome(), this.getNumero(), this.getAgencia(), this.getDataDeAbertura(), this.verificaSaldo());
	}

}
