package br.com.devinhouse.exerciciodez.model;

public class Fatura {

	private String numero;
	private String descricao;
	private int quantidadeComprada;
	private double precoPorItem;

	public Fatura(String numero, String descricao, int quantidadeComprada, double precoPorItem) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = (quantidadeComprada >= 0) ? quantidadeComprada : 0;
		this.precoPorItem = (precoPorItem >= 0.0) ? precoPorItem : 0.0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = (quantidadeComprada >= 0) ? quantidadeComprada : 0;
	}

	public double getPrecoPorItem() {
		return precoPorItem;
	}

	public void setPrecoPorItem(double precoPorItem) {
		this.precoPorItem = (precoPorItem >= 0.0) ? precoPorItem : 0.0;
	}

	public double getValorFatura() {
		return this.quantidadeComprada * this.precoPorItem;
	}

	public String getFatura() {
		return String.format(
				"	Detalhes do Pedido%nNúmero do produto: %s%nDescrição do produto: %s%nQuantidade de produtos: %d%nPreço por produto: %.2f%n  Valor final do pedido: %.2f%n%n",
				this.numero, this.descricao, this.quantidadeComprada, this.precoPorItem, this.getValorFatura());
	}

}
