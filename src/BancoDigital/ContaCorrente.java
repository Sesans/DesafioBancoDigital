package BancoDigital;

import java.util.Random;

public class ContaCorrente extends Conta{
    Random gerador = new Random();
    private double jurosMensal = 0.5d;
    private String cartao;
    private double limite;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return super.toString() + " , Cartão: '" + this.cartao + "'}" ;
    }

    public double getJurosMensal() {
        return jurosMensal;
    }

    public void setJurosMensal(float jurosMensal) {
        this.jurosMensal = jurosMensal;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
