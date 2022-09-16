package br.com.devmatheusguerra.bytebank.controllers;

import br.com.devmatheusguerra.bytebank.exceptions.SemLimiteException;
import br.com.devmatheusguerra.bytebank.exceptions.SenhaErradaException;
import br.com.devmatheusguerra.bytebank.exceptions.ValorInvalidoException;

import java.util.ArrayList;

public class Conta {

    private int numeroConta;
    private int agencia;
    private int senha;
    private Cliente titular;
    private double saldo = 0.;

    private ArrayList<Extrato> extratos = new ArrayList<Extrato>();

    public Conta(int conta, int agencia, int senha, Cliente titular){
        this.numeroConta = conta;
        this.agencia = agencia;
        this.senha = senha;
        this.titular = titular;
    }

/**************************
 * ****** Getters ****** *
 *************************/

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getSenha() {
        return senha;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    /**************************
     * **** Getters Ends **** *
     *************************/

    public boolean deposita(double valor){
        if(valor > 0){
            this.saldo += valor;
            this.exibeSaida("O valor de R$ " + valor + " foi depositado na conta");
            Extrato extrato = new Extrato();
            return this.extratos.add(new ExtratoDeDeposito(this, valor));
        }

        throw new ValorInvalidoException();

    }

    public boolean saca(double valor){
        if(valor > 0 && valor <= this.saldo){
            this.exibeSaida("O valor de R$ " + valor + " foi sacado na conta");
            this.saldo -= valor;
            this.extratos.add(new ExtratoDeSaque(this, valor));
            return true;
        }

        throw new SemLimiteException();
    }



    public boolean transfere(Conta destinatario, double valor){
        if(valor > 0 && valor <= this.saldo){
            this.exibeSaida("O valor de R$ " + valor + " foi transferido para " + destinatario.titular.getNome());
            this.saldo -= valor;
            destinatario.deposita(valor);
            return true;
        }

        throw new SemLimiteException();

    }


    private boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            throw new SenhaErradaException();
        }
    }

    private void exibeSaida(String mensagem){
        System.out.println(mensagem);
    }

}
