public abstract class FuncionarioAutenticavel extends Funcionario{
    private int senha;

    public FuncionarioAutenticavel(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean autentica(int senha){
        return this.senha == senha;
    }
}

