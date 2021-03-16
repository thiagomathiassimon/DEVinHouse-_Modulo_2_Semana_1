package br.com.devinhouse.exercicionove.model;

public class Data {

	int dia;
	int mes;
	int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String exibirData() {
		String dia = (this.dia <= 10) ? "0" + Integer.toString(this.dia) : Integer.toString(this.dia);
		String mes = (this.mes <= 10) ? "0" + Integer.toString(this.mes) : Integer.toString(this.mes);
		return String.format("%s/%s/%d", dia, mes, this.ano);
	}

}
