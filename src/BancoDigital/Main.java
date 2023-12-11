package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("123.456.789-00", "Teste1");
        Cliente cliente2 = new Cliente("123.456.789-00", "Teste2");
        Conta cc1 = new ContaCorrente(cliente1);
        Conta cc2 = new ContaCorrente(cliente2);
        cc1.depositar(1000.00);
        cc1.sacar(500.00);
        cc1.depositar(2000.00);
        cc1.depositar(800.00);
        cc1.sacar(5000.00);
        cc1.sacar(2000.00);
        cc1.imprimirExtrato();

        System.out.println(cc2.toString());
        System.out.println(cc1.toString());
    }
}