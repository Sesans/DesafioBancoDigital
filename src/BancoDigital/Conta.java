package BancoDigital;

import java.util.ArrayList;
import java.util.List;
public class Conta {
    private String numeroConta;
    private String agencia;
    private double saldo;
    private Cliente cliente;
    private List<String> extrato = new ArrayList<>();

    public Conta(String numeroConta, String agencia, double saldo, Cliente cliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
        System.out.println("BancoDigital.Conta criada com sucesso!");
    }
    public Conta(String numeroConta, String agencia, Cliente cliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.cliente = cliente;
        System.out.println("BancoDigital.Conta criada com sucesso!");
    }
    public void sacar(double valorSaque){
        if(saldo>=valorSaque){
            saldo -= valorSaque;
            extrato.add("Saque: R$" + String.valueOf(valorSaque));
            System.out.println("Saque efetuado com sucesso!");
        }
        else
            System.out.println("Valor: " + valorSaque + "acima do saldo atual: " + saldo);
    }
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
        extrato.add("Depósito: R$" + String.valueOf(valorDeposito));
        System.out.println("Deposito efetuado com sucesso!");
    }
    public void transferir(Double valor, Conta destino){
        if(saldo>=valor){
            this.saldo -= valor;
            destino.saldo += valor;
            extrato.add("Transferência: R$" + String.valueOf(valor) + " para: " + destino.cliente.getNome());
            System.out.println("Transferência efetuada com sucesso!");
        }
    }
    public void imprimirExtrato(){
        System.out.println("\tExtrato: ");
        extrato.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "BancoDigital.Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
