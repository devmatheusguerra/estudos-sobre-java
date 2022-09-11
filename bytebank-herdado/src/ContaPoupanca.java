public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int conta, double saldo, Cliente titular){
        super(agencia, conta, saldo, titular);
    }

    public double getTaxaMensal(){
        return super.getSaldo() * 0.01;
    }

}
