package br.com.devmatheusguerra.bytebank.exceptions;

public class SemLimiteException extends RuntimeException{
    public SemLimiteException(){
        super("O saldo é inferior ao valor solicitado.");
    }
}
