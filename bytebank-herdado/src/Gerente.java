public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }


    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }


    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
