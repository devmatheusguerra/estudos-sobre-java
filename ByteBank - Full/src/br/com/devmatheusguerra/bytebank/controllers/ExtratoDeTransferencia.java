package br.com.devmatheusguerra.bytebank.controllers;

public class ExtratoDeTransferencia extends Extrato{
    private Conta destinatario;

    public void ExtratoDeTransferencia(Conta remetente, double valor, Conta destinatario){
        super.Extrato(remetente, valor);
        this.destinatario = destinatario;
    }

    public String geraExtrato(){
        return super.geraExtrato(super.getCreated_at(), super.getValor(), "Depósito", this.destinatario);
    }
}
