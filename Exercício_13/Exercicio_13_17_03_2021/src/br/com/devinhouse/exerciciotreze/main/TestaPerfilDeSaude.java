package br.com.devinhouse.exerciciotreze.main;

import java.util.Scanner;

import br.com.devinhouse.exerciciotreze.model.PerfilDeSaude;

public class TestaPerfilDeSaude {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Usuário, informai vosso nome:");
		String nome = scanner.nextLine();
		System.out.println("Usuário, informai vosso sobrenome:");
		String sobrenome = scanner.nextLine();
		System.out.println("Usuário, informai vosso sexo:");
		String sexo = scanner.nextLine();
		System.out.println("Usuário, informai vossa data de nascimento:");
		String dataDeNascimento = scanner.nextLine();
		System.out.println("Usuário, informai vossa altura:");
		double altura = Double.parseDouble(scanner.nextLine());
		System.out.println("Usuário, informai vosso peso:");
		double peso = Double.parseDouble(scanner.nextLine());

		PerfilDeSaude novoPerfil = new PerfilDeSaude(nome, sobrenome, sexo, dataDeNascimento, altura, peso);

		System.out.format(
				"	Perfil de Saúde:%nNome: %s%nSobrenome: %s%nSexo: %s%nData de nascimento: %s%nAltura: %.2f%nPeso: %.2f%nIdade: %d%nFrequência cardíaca máxima: %.2f%nFrequência cardíaca alvo: %s%nIMC: %.2f",
				novoPerfil.getNome(), novoPerfil.getSobrenome(), novoPerfil.getSexo(), novoPerfil.getDataDeNascimento(),
				novoPerfil.getAltura(), novoPerfil.getPeso(), novoPerfil.retornarIdadeEmAnos(),
				novoPerfil.retornarFrequenciaCardiacaMaxima(), novoPerfil.retornarFrequenciaCardiacaAlvo(),
				novoPerfil.calcularImc());

		scanner.close();
	}

}
