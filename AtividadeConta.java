package POO4;

public class AtividadeConta {

	public static void main(String[] args) {

		Conta conta = new Conta();

		conta.setId(11);
		conta.setSaldo(1000);
		conta.setTipo("Corrente");

		System.out.println("ID: " + conta.id);
		System.out.println("Tipo: " + conta.tipo);
		System.out.println("Saldo: R$ " + conta.saldo);

		
		conta.sacar(200);
		conta.depositar(500);
		conta.consultarHistórico("10 transações");
		conta.sair();
	}

}
