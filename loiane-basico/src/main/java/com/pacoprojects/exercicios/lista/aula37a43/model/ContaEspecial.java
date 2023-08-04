package com.pacoprojects.exercicios.lista.aula37a43.model;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if ((super.getSaldo() + this.limite) >= valor) {
            super.setSaldo(super.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return  super.toString() + ", ContaEspecial{" +
                "limite=" + limite +
                '}';
    }
}
