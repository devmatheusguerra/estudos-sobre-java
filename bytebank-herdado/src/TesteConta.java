public class TesteConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matheus", "67890123214", "Desenvolvedor");
        ContaCorrente cc = new ContaCorrente(1234, 4321, 1000, cliente);
        ContaPoupanca cp = new ContaPoupanca(1234, 4321, 1000, cliente);

        System.out.println(cc.getTaxaMensal());
        System.out.println(cp.getTaxaMensal());
    }
}
