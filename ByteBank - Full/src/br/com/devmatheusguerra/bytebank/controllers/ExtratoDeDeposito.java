package br.com.devmatheusguerra.bytebank.controllers;
import br.com.devmatheusguerra.bytebank.controllers.Conta;
public class ExtratoDeDeposito extends Extrato{
    public ExtratoDeDeposito(Conta conta, double valor) {
        super();
    }

    public String geraExtrato(){
        return super.geraExtrato(super.getCreated_at(), super.getValor(), "Depósito", null);
    }
}
