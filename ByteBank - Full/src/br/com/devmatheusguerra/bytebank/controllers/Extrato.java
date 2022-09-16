package br.com.devmatheusguerra.bytebank.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Extrato {

    private LocalDateTime created_at;
    private double valor;
    private Conta conta;

    public void Extrato(Conta conta, double valor) {
        ZoneId timezone = ZoneId.of("America/Fortaleza");
        this.created_at = LocalDateTime.now(timezone);
        this.valor = valor;
        this.conta = conta;
    }

    public String geraCabecalho(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return
                        "---------------------------------" +
                        "\n-------" + this.created_at.format(formatter)+ "-------" +
                        "\n---------------------------------" +
                                "\nAgência:\t" + this.conta.getAgencia() +
                                "\nConta:\t" + this.conta.getNumeroConta() +
                                "\nTitular:\t" + this.conta.getTitular().getNome() +
                                "\n---------------------------------" +
                                "\n---------------------------------";


    }
    public String geraExtrato(LocalDateTime now, double valor, String tipo, Conta conta){
        if(tipo.equalsIgnoreCase("Depósito") || tipo.equalsIgnoreCase("Saque")) {
            return "\n" + now + "\t" + tipo + "\t R$ " + valor + "\n\n";
        }else{
            return "\n" + now + "\t" + tipo + "\n" +
                    "Valor: R$ " + valor + "\n" +
                    "Ag: " + this.getConta().getAgencia() + "\tConta: " + this.conta.getNumeroConta() + "\t==>\tAg: " +
                    conta.getAgencia() + "\tConta: " + conta.getNumeroConta() + "\n\n";
        }
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public double getValor() {
        return valor;
    }

    public Conta getConta() {
        return conta;
    }
}
