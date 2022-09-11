public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario func = new Funcionario("Matheus Guerra", "12345678910", 3000.0);
        System.out.println(func.getSalario());
        System.out.println(func.getBonificacao());
    }
}
