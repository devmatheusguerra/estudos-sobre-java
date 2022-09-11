public class Gerente extends Funcionario{
    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }

        return false;
    }

}
