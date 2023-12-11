package BancoDigital;

public class ContaPoupanca extends Conta{
    private double rendimentoMensal;
    private double depositoInicial;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(double rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
}
