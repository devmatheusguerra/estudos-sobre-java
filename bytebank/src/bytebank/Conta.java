package bytebank;

import java.util.ArrayList;

public class Conta {

	private double saldo = 0;
	private int agencia;
	private int conta;
	private Cliente titular;
	private ArrayList<Extrato> extratos;

	public Conta(int agencia, int conta, Cliente titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.extratos = new ArrayList<Extrato>();
	}
	
	
//	Getters Methods
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void getExtratos(){
			
			System.out.println("Cliente: " + this.titular.getNome());
			System.out.println("CPF: " + this.titular.getCpf());
			System.out.println("Agência: " + this.agencia + "\t conta: " + this.conta);
			System.out.println("====================================================");
		for(int i = 0; i < this.extratos.size(); i++) {
			
			System.out.println("----------------------------------------------------");
			Extrato extrato = this.extratos.get(i);
			System.out.println(extrato.getTransacao());
			System.out.println(extrato.getDataEHoraFormatada() + " => R$ " + extrato.getValor());
			System.out.println("----------------------------------------------------");
		}
		
		
	}
	
//	Others Methods
	private void adicionarTransacaoAoExtrato(String tipoDeTransacao, double valor) {
		
		Extrato transacao = new Extrato(tipoDeTransacao, valor);
		this.extratos.add(transacao);
	}
	
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			this.adicionarTransacaoAoExtrato("Saque", valor);
			return true;
		}

		return false;
	}

	public boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			this.adicionarTransacaoAoExtrato("Depósito", valor);
			return true;
		}

		return false;
	}

	public boolean transfere(Conta destinatario, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destinatario.deposita(valor);
			this.adicionarTransacaoAoExtrato("Transferência", valor);

			return true;
		}

		return false;
	}

}
