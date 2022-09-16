package br.com.devmatheusguerra.bytebank.exceptions;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException (){
        super("O Valor definido é inválido!");
    }
}
