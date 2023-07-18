package com.pacoprojects.exercicios.lista.aula28a33.model;

public class ContaCorrente {
    private String agencia;
    private String numero;
    private String titular;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double limiteUsado; 

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.debitarSaque(valor);
        } else if ((this.limiteEspecial + this.saldo >= valor)) {
            this.debitarSaqueEspecial(valor);
            this.especial = true;
        } else {
            System.out.println("Desculpe, saldo insuficiente para saque.");
        }
    }
    
    private void debitarSaque(double valor) {
        this.saldo -= valor;
    }

    private void debitarSaqueEspecial(double valor) {
        this.debitarSaque(valor);
        this.limiteUsado += this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        if (this.saldo >= 0 && this.especial) {
            this.limiteUsado = 0;
            this.especial = false;
        }
    }

    public double consultarSaldo() {
        return this.getSaldo();
    }

    public void verificarUsoChequeEspecial() {
        if (this.especial) {
            System.out.println("O cliente está utilizando o limite do cheque especial.");
        } else {
            System.out.println("O cliente não está utilizando o limite do cheque especial.");
        }
    }
}
