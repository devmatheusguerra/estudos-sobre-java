package br.com.devmatheusguerra.bytebank.tests;

import br.com.devmatheusguerra.bytebank.controllers.Cliente;
import br.com.devmatheusguerra.bytebank.controllers.Conta;
import br.com.devmatheusguerra.bytebank.controllers.ContaCorrente;
import br.com.devmatheusguerra.bytebank.controllers.ContaPoupanca;

public class testeConta {

    public static void main(String[] args){
        Cliente cliente = new Cliente("Joao", "12345678910");
        Cliente cliente2 = new Cliente("Marcos Paulo", "12345678910");
        ContaCorrente c1 = new ContaCorrente(123,45678, 123, cliente);
        c1.deposita(400);
        System.out.println(c1.getSaldo());
        c1.saca(50);
        System.out.println(c1.getSaldo());
        c1.deposita(75);
        System.out.println(c1.getSaldo());


        ContaCorrente c2 = new ContaCorrente(122,31643, 321, cliente2);

        c1.transfere(c2, 110);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        System.out.println(c1.getSaldo()); // Testando Exception.

    }

}
