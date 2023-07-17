package com.pacoprojects.exercicios.lista.aula25a27;

import com.pacoprojects.exercicios.lista.aula25a27.model.ContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = "123456";
        contaCorrente.agencia = "123";
        contaCorrente.isEspecial = false;
        contaCorrente.banco = "Banco do Brasil";
        contaCorrente.titular = "Fulano da Silva";
        contaCorrente.limite = 90000;
        contaCorrente.saldo = 4000;

        contaCorrente.consultarSaldo();
        if (contaCorrente.isChequeEspecial() ) {
            System.out.println("Você está usando o cheque especial");
        } else {
            System.out.println("Você não está utilizando o cheque especial");
        }
        contaCorrente.depositar(8570);
        System.out.println("Deposito realizado com sucesso.");
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(1500);
        contaCorrente.consultarSaldo();
    }
}
