package com.pacoprojects.exercicios.lista.aula37a43.model;

public class ContaPoupanca extends ContaBancaria{
    private String diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, String diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public String getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", ContaPoupanca{" +
                "diaRendimento='" + diaRendimento + '\'' +
                '}';
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        super.setSaldo(super.getSaldo() + (super.getSaldo() * (taxaRendimento / 100)));
    }
}
