package com.pacoprojects.exercicios.lista.aula37a43.model;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", ContaPoupanca{" +
                "diaRendimento='" + diaRendimento + '\'' +
                '}';
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        if (LocalDate.now().getDayOfMonth() == this.diaRendimento) {
            super.setSaldo(super.getSaldo() + (super.getSaldo() * (taxaRendimento / 100)));
            System.out.println("Novo rendimento aplicado.");
        } else {
            System.out.println("Não é o dia de rendimento.");
        }
    }
}
