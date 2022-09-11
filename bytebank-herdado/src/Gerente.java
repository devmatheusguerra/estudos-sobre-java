public class Gerente extends FuncionarioAutenticavel{
    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario, senha);
        this.senha = senha;
    }

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }


}
