package br.com.devinhouse.exerciciodez.main;

import br.com.devinhouse.exerciciodez.model.Fatura;

public class TestaFatura {

	public static void main(String[] args) {

		String numero = "M606";
		String descricao = "\n- Sensor Pixart 3168 para Alta Precisão (10G ACC)\r\n" + "- Retroiluminação LED (4 Cores)\r\n"
				+ "- Botão para Troca de DPI \"On-The-Fly\" (4 Velocidades de DPI)\r\n" + "- 6 Botões Programáveis \r\n"
				+ "- Altamente indicado para Jogos Estilo MOBA\r\n"
				+ "- Pegada Ultra Confortável para usuários estilo Claw e Palm\r\n"
				+ "- Produto Pré-Configurado: não há suporte para Software neste Modelo";
		int quantidade = 2;
		double precoUnitario = 90.00;

		Fatura novaFatura = new Fatura(numero, descricao, quantidade, precoUnitario);

		System.out.println(novaFatura.getFatura());

		novaFatura.setQuantidadeComprada(-3);

		System.out.println("Qunatidade produtos: " + novaFatura.getQuantidadeComprada());
		System.out.println("Valor final do pedido: " + novaFatura.getValorFatura());

		novaFatura.setQuantidadeComprada(5);

		System.out.println("\nQunatidade produtos: " + novaFatura.getQuantidadeComprada());
		System.out.println("Valor final do pedido: " + novaFatura.getValorFatura());

		novaFatura.setPrecoPorItem(95.50);

		System.out.println("\nQunatidade produtos: " + novaFatura.getPrecoPorItem());
		System.out.println("Valor final do pedido: " + novaFatura.getValorFatura() + "\n\n");

		System.out.println(novaFatura.getFatura());
	}

}
