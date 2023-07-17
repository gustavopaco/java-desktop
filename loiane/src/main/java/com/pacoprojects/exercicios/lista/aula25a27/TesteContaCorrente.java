package com.pacoprojects.exercicios.lista.aula25a27;

import com.pacoprojects.exercicios.lista.aula25a27.model.ContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = "123456";
        contaCorrente.agencia = "123";
        contaCorrente.isEspecial = true;
        contaCorrente.banco = "Banco do Brasil";
        contaCorrente.titular = "Fulano da Silva";
        contaCorrente.limite = 90000;
        contaCorrente.saldo = 4000;

        System.out.println(contaCorrente.consultarSaldo());
        System.out.println(contaCorrente.isEspecial());
        contaCorrente.depositar(8570);
        System.out.println(contaCorrente.consultarSaldo());
        contaCorrente.sacar(1500);
        System.out.println(contaCorrente.consultarSaldo());
    }
}
