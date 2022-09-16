package br.com.devmatheusguerra.bytebank.controllers;

public class ContaCorrente extends Conta {

    private double taxaDeServico = 0.05;
    public ContaCorrente(int conta, int agencia, int senha, Cliente titular){
        super(conta, agencia, senha, titular);
    }

    @Override
    public boolean saca(double valor){
        return super.saca(valor * (1 + this.taxaDeServico));
    }

    @Override
    public boolean transfere(Conta destinatario, double valor){
        super.saca(valor * (1 + this.taxaDeServico));
        return super.transfere(destinatario, valor);
    }
}
