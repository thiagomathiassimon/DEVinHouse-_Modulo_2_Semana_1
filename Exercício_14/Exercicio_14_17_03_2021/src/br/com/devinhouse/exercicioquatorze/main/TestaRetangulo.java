package br.com.devinhouse.exercicioquatorze.main;

import br.com.devinhouse.exercicioquatorze.model.Retangulo;

public class TestaRetangulo {

	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo(2, 3);

		exibirInformacoesDoRetangulo(retangulo);

		retangulo.setAlutra(21.00);
		retangulo.setComprimento(21.00);

		exibirInformacoesDoRetangulo(retangulo);

		retangulo.setAlutra(2.00);
		retangulo.setComprimento(10.00);

		exibirInformacoesDoRetangulo(retangulo);

	}

	public static void exibirInformacoesDoRetangulo(Retangulo retangulo) {
		System.out.format("	Retângulo:%nAltura: %.2f%nComprimento: %.2f%nÁrea: %.2f%nPerímetro: %.2f%n%n",
				retangulo.getAlutra(), retangulo.getComprimento(), retangulo.calcularArea(), retangulo.calcularPerimetro());

	}

}
