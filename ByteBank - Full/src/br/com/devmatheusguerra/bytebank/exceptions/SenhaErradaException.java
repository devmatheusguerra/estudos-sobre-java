package br.com.devmatheusguerra.bytebank.exceptions;

public class SenhaErradaException extends RuntimeException {
    public SenhaErradaException(){
        super("Senhas não são iguais.");
    }
}
