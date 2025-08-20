package POO4;

public class AtividadeCadeira {

	public static void main(String[] args) {

		Cadeira cadeira = new Cadeira();

		cadeira.setCor("Preta");
		cadeira.setMaterial("Couro Sintético e Metal");
		cadeira.setPossuiApoioBracos("Possui Apoios Para Braços");
		cadeira.setPossuiRodas("Possui Rodas");
		cadeira.setRegulagemAltura("Possui Regulagem de Altura");

		System.out.println(cadeira.getCor());
		System.out.println(cadeira.getMaterial());
		System.out.println(cadeira.getPossuiApoioBracos());
		System.out.println(cadeira.getPossuiRodas());
		System.out.println(cadeira.getRegulagemAltura());
		
		cadeira.girar();
        cadeira.reclinar();
        cadeira.ajustarAltura(120);
        cadeira.mover("para frente");

	}

}
