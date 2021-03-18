package br.com.devinhouse.exerciciodezessete.main;

import br.com.devinhouse.exerciciodezessete.model.ContaPoupanca;

public class TestaContaPoupanca {

	final static int NUMERO_DE_MESES_DO_ANO = 12;

	public static void main(String[] args) {

		ContaPoupanca poupador1 = new ContaPoupanca(2000.00);
		ContaPoupanca poupador2 = new ContaPoupanca(3000.00);

		ContaPoupanca.alterarTaxaAnual(0.04);

		exibirSaldoDasContas("Saldo do poupador1 no mês %d : %.2f%n", poupador1);
		exibirSaldoDasContas("Saldo do poupador2 no mês %d : %.2f%n", poupador2);

		ContaPoupanca.alterarTaxaAnual(0.05);

		exibirSaldoDasContas("Saldo do poupador1 no mês %d : %.2f%n", poupador1);
		exibirSaldoDasContas("Saldo do poupador2 no mês %d : %.2f%n", poupador2);
	}

	public static void exibirSaldoDasContas(String textoDeSaida, ContaPoupanca poupador) {
		System.out.println("");

		for (int i = 1; i <= NUMERO_DE_MESES_DO_ANO; i++) {
			poupador.calcularJuroMensal();
			System.out.format(textoDeSaida, i, poupador.getSaldo());
		}

	}

}
