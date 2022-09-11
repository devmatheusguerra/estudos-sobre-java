package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int conta;
	private String titular;
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(Conta destinatario, double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destinatario.deposita(valor);
			
			return true;
		}
		
		return false;
	}
	
}
