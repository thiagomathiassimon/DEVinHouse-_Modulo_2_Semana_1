package br.com.devinhouse.exerciciodoze.util;

import java.util.Calendar;

public class DataAtual {

	Calendar calendario = Calendar.getInstance();

	public String retornarDataAtual(int posicao) {
		String dia = (calendario.get(Calendar.DAY_OF_MONTH) >= 10)
				? Integer.toString(calendario.get(Calendar.DAY_OF_MONTH))
				: "0" + Integer.toString(calendario.get(Calendar.DAY_OF_MONTH));
		String mes = ((calendario.get(Calendar.MONTH) + 1) >= 10) ? Integer.toString(calendario.get(Calendar.MONTH) + 1)
				: "0" + (calendario.get(Calendar.MONTH) + 1);
		String ano = Integer.toString(calendario.get(Calendar.YEAR));
		String[] dataAtual = {dia, mes, ano};
		return dataAtual[posicao];
	}

}
