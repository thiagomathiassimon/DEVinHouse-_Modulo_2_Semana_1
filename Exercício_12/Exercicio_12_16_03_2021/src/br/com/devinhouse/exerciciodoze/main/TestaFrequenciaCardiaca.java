package br.com.devinhouse.exerciciodoze.main;

import br.com.devinhouse.exerciciodoze.model.FrequenciaCardiaca;

public class TestaFrequenciaCardiaca {

	public static void main(String[] args) {

		FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca("Thiago Mathias", "Simon", "26/08/2002");

		System.out.format(
				"	Dados:%nNome completo: %s%nData de nascimento: %s%nIdade: %d%nFrequência cardíaca alvo: %s%nFrequência cardíaca máxima: %.2f",
				frequenciaCardiaca.getNomeDaPessoa() + " " + frequenciaCardiaca.getSobrenomeDaPessoa(),
				frequenciaCardiaca.getDataDeNascimentoDaPessoa(), frequenciaCardiaca.retornarIdadeEmAnos(),
				frequenciaCardiaca.retornarFrequenciaCardiacaAlvo(), frequenciaCardiaca.retornarFrequenciaCardiacaMaxima());

	}

}
