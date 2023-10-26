package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("134.355.464-09", "Leonardo");
        Cliente cliente2 = new Cliente("194.785.464-29", "Regilane");
        Conta cc1 = new Conta("02349656-3", "1234", cliente1);
        Conta cc2 = new Conta("98756345-3", "6545", cliente1);
        cc1.depositar(1000.00);
        cc1.sacar(500.00);
        cc1.transferir(500.00, cc2);
        cc1.imprimirExtrato();
    }
}