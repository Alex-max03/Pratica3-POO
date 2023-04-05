package br.com.newton.Aula21;

public class ContaPopanca extends Conta {
    private double rendimento;
    public ContaPopanca(int numero, double saldo, double rendimento) {
        super(numero, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    public void atualizaRendimento( ){
        double atual;
        atual= getSaldo()+(getSaldo()*(this.rendimento/100));
        setSaldo(atual);
    }
}

