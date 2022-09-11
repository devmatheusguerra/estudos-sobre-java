public class TesteFuncionario {
    public static void main(String[] args){
        Designer d = new Designer("Joao", "123", 2000.0);
        FuncionarioAutenticavel gerente = new Gerente("CJ", "23455238197",2000, 1243);
        SistemaInterno si = new SistemaInterno();
        System.out.println(si.autentica(gerente));

    }
}
