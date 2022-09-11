package bytebank;

public class Conta {

	private double saldo = 0;
	private int agencia;
	private int conta;
	private Cliente titular;

	public void main(int agencia, int conta, Cliente titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}
	
	
//	Getters Methods
	
	public double getSaldo() {
		return this.saldo;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}

		return false;
	}

	public boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;

			return true;
		}

		return false;
	}

	public boolean transfere(Conta destinatario, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destinatario.deposita(valor);

			return true;
		}

		return false;
	}

}
