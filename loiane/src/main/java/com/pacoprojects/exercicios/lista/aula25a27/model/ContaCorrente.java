package com.pacoprojects.exercicios.lista.aula25a27.model;

public class ContaCorrente {
    public String numero;
    public String agencia;
    public String titular;
    public String banco;
    public boolean isEspecial;
    public double saldo;
    public double limite;

    public void sacar(double quantidade) {
        if (saldo > quantidade) {
            saldo -= quantidade;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Desculpe você não tem saldo suficiente para sacar.");
        }
    }

    public void depositar(double quantidade) {
        saldo += quantidade;
        System.out.println("Deposito realizado com sucesso.");
    }

    public double consultarSaldo(){
        return saldo;
    }

    public boolean isEspecial() {
        return isEspecial;
    }
}
