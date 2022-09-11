public class TesteGerente {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Marcos", "12354387690", 3000.0);
        gerente.setSenha(1234);
        System.out.println(gerente.autentica(1234));
        System.out.println(gerente.getBonificacao());
    }

}
