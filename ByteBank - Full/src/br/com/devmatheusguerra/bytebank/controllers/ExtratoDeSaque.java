package br.com.devmatheusguerra.bytebank.controllers;
import br.com.devmatheusguerra.bytebank.controllers.Conta;

public class ExtratoDeSaque extends Extrato{
    public ExtratoDeSaque(Conta conta, double valor) {
        super();
    }

    public String geraExtrato(){
        return super.geraExtrato(super.getCreated_at(), super.getValor(), "Saque", null);
    }
}
