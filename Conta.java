package POO4;

public class Conta {

	int id;
	String tipo;
	double saldo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("O valor do saque deve ser maior que zero!");
		} else if (valor > saldo) {
			System.out.println("Saldo insuficiente para saque de R$ " + valor);
		} else {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado!");
		}
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("O valor do depósito deve ser maior que zero!");
		} else {
			saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado!");
		}

	}

	public void consultarHistórico(String historico) {
		System.out.println("O seu histório é: " + historico);
	}

	public void sair() {
		System.out.println("Você está saindo da conta...");
	}
}
