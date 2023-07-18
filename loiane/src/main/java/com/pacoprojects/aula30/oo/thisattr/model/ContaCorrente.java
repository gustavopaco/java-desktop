package com.pacoprojects.aula30.oo.thisattr.model;

public class ContaCorrente {
    public String numero;
    public String agencia;
    public String titular;
    public String banco;
    public boolean isEspecial;
    public double saldo;
    public double limiteUsado = 0;
    public double limite;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, String titular, String banco, boolean isEspecial, double saldo, double limiteUsado, double limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.banco = banco;
        this.isEspecial = isEspecial;
        this.saldo = saldo;
        this.limiteUsado = limiteUsado;
        this.limite = limite;
    }

    public void debitar(double valor) {
        this.saldo -= valor;
    }

    public void debitarEspecial(double valor) {
        this.limiteUsado = (this.saldo - valor) * (-1);
        this.saldo = 0;
        this.isEspecial = true;
    }

    public void sacar(double quantidade) {
        if (this.saldo >= quantidade) {
            this.debitar(quantidade);
            System.out.println("Saque realizado com sucesso.");
        } else if ((this.isEspecial) && ((this.limite + this.saldo) >= quantidade) && ((this.limite - this.limiteUsado) >= quantidade)) {
            this.debitarEspecial(quantidade);
            System.out.println("Saque realizado do cheque especial.");
        } else {
            System.out.println("Desculpe você não tem saldo suficiente para sacar.");
        }
    }

    public void depositar(double quantidade) {
            this.saldo += quantidade;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    public boolean isChequeEspecial() {
        return limiteUsado > 0;
    }
}
