package br.com.devinhouse.exercicioonze.main;

import br.com.devinhouse.exercicioonze.model.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario primeiroFuncionario = new Funcionario("Juca", "Tadeu", 1600.00);
		Funcionario segundoFuncionario = new Funcionario("Pedro", "da Silva", 2000.00);

		System.out.format("O funcionário: %s possui salário anual de: R$%.2f.%n",
				primeiroFuncionario.getPrimeiroNome() + " " + primeiroFuncionario.getSobrenome(),
				primeiroFuncionario.exibirSalarioAnual());
		System.out.format("O funcionário: %s possui salário anual de: R$%.2f.%n",
				segundoFuncionario.getPrimeiroNome() + " " + segundoFuncionario.getSobrenome(),
				segundoFuncionario.exibirSalarioAnual());

		primeiroFuncionario.gerarAumento(10);
		segundoFuncionario.gerarAumento(10);

		System.out.format("O funcionário: %s possui salário anual de: R$%.2f.%n",
				primeiroFuncionario.getPrimeiroNome() + " " + primeiroFuncionario.getSobrenome(),
				primeiroFuncionario.exibirSalarioAnual());
		System.out.format("O funcionário: %s possui salário anual de: R$%.2f.%n",
				segundoFuncionario.getPrimeiroNome() + " " + segundoFuncionario.getSobrenome(),
				segundoFuncionario.exibirSalarioAnual());
	}

}
