package BancoDigital;

import java.time.Instant;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public abstract class Conta {
    private Random gerador = new Random();
    private String numeroConta;
    private String agencia;
    private double saldo;
    private Cliente cliente;
    private List<String> extrato = new ArrayList<>();

    public Conta(Cliente cliente){
        this.numeroConta = String.format("%09d", gerador.nextInt(999999999));
        this.agencia = String.format("%04d", gerador.nextInt(9999));
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
            System.out.println("Valor: " + valorSaque + " acima do saldo atual: " + saldo);
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
                "Titular da conta: '" + cliente.getNome() + '\'' +
                ", número da conta: '" + numeroConta + '\'' +
                ", agência: '" + agencia + '\'' +
                ", saldo: " + saldo ;
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
