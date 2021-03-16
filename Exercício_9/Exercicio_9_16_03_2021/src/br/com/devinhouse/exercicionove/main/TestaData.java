package br.com.devinhouse.exercicionove.main;

import br.com.devinhouse.exercicionove.model.Data;

public class TestaData {

	public static void main(String[] args) {

		int dia = 26;
		int mes = 8;
		int ano = 2021;

		Data novaData = new Data(dia, mes, ano);

		System.out.println(novaData.exibirData());

		novaData.setDia(05);
		novaData.setMes(3);
		novaData.setAno(2022);

		System.out.println(novaData.exibirData());

		dia = novaData.getDia();
		mes = novaData.getMes();
		ano = novaData.getAno();

		System.out.format("Dia: %d%nMês: %d%nAno: %d", dia, mes, ano);

	}

}
