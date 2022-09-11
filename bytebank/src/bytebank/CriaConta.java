package bytebank;

public class CriaConta {
	public static void main (String[] args) {
		
		Cliente cliente1 = new Cliente("Matheus Guerra", "12345678910", "Professor");
		Conta conta1 = new Conta(1332, 24092, cliente1);
		
		Cliente cliente2 = new Cliente("João", "12345698711", "Desenvolvedor");
		Conta conta2 = new Conta(2331, 29042, cliente2);
		
		conta1.deposita(1000);
		conta1.saca(100);
		conta1.transfere(conta2, 200);
		
		conta2.saca(100);
		conta2.deposita(150);
		
		conta1.getExtratos();
		
		
		
		
	}
}
