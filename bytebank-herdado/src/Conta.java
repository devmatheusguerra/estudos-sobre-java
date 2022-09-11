public class Conta {
    private int agencia;
    private int conta;
    private double saldo;
    private Cliente titular;

    public Conta(int agencia, int conta, double saldo, Cliente titular){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
}
