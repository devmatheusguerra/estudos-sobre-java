
public class Fatorial {
	public static void main(String[] args) {
		int numero = 5;
		
		int resultadoFatorial = 1; 
		
		for(int i = 2; i <= numero; i++) {
			resultadoFatorial *= i;
		}
		
		System.out.println("O resultado de " + numero + "! é: " + resultadoFatorial);
	}
	
}
