public class SistemaInterno {
    private int senha = 1234;
    public boolean autentica(FuncionarioAutenticavel f){
        return f.autentica(senha);
    }
}
