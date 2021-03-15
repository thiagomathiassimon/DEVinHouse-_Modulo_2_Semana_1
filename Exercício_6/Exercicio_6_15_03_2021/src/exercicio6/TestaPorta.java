package exercicio6;

public class TestaPorta {

	public static void main(String[] args) {

		Porta porta = new Porta();

		porta.setAltura(2.10);

		porta.setLargura(1.00);

		porta.setProfundidade(0.30);

		porta.setCor("Preta");

		String estadoDaPorta = (porta.estaAberta()) ? "Aberta" : "Fechada";

		System.out.format("A porta de dimensões: %.2f X %.2f X %.2f,%nCor: %s,%nEstá: %s.", porta.getAltura(),
				porta.getLargura(), porta.getProfundidade(), porta.getCor(), estadoDaPorta);

		porta.abre();

		estadoDaPorta = (porta.estaAberta()) ? "Aberta" : "Fechada";

		System.out.format("%n%nA porta de dimensões: %.2f X %.2f X %.2f,%nCor: %s,%nEstá: %s.", porta.getAltura(),
				porta.getLargura(), porta.getProfundidade(), porta.getCor(), estadoDaPorta);

		porta.setCor("Marrom");

		porta.setAltura(1.90);

		porta.setLargura(1.20);

		porta.setProfundidade(0.10);

		porta.fecha();

		estadoDaPorta = (porta.estaAberta()) ? "Aberta" : "Fechada";

		System.out.format("%n%nA porta de dimensões: %.2f X %.2f X %.2f,%nCor: %s,%nEstá: %s.", porta.getAltura(),
				porta.getLargura(), porta.getProfundidade(), porta.getCor(), estadoDaPorta);

	}

}
