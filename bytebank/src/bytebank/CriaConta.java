package bytebank;

public class CriaConta {
	public static void main (String[] args) {
		
		Conta conta1 = new Conta();
		System.out.println(conta1.getSaldo());
		conta1.deposita(1000);
		System.out.println(conta1.getSaldo());
		
	}
}
