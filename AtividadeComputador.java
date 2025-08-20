package POO4;

public class AtividadeComputador {

	public static void main(String[] args) {

		Computador computador = new Computador();

		computador.setArmazenamento("512 GB SSD");
		computador.setMemoriaRAM("16 GB");
		computador.setPlacaDeVideo("NVIDIA GeForce GTX 1660");
		computador.setProcessador("Intel Core i5");
		computador.setSistemaOperacional("Windows 11");
		computador.setMouse("Dell MS116");
		computador.setTeclado("Multilaser Slim");

		System.out.println(computador.getArmazenamento());
		System.out.println(computador.getMemoriaRAM());
		System.out.println(computador.getPlacaDeVideo());
		System.out.println(computador.getProcessador());
		System.out.println(computador.getSistemaOperacional());
		System.out.println(computador.getMouse());
		System.out.println(computador.getTeclado());

		computador.ligar();
		computador.instalarPrograma("Google Chrome");
		computador.reiniciar();
		computador.desligar();
	}

}
