package com.pacoprojects.exercicios.lista.aula28a33;

import com.pacoprojects.exercicios.lista.aula28a33.model.ContaCorrente;

public class BootContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia("123456");
        cc.setNumero("123456789");
        cc.setTitular("Gustavo Paco");
        cc.setLimiteEspecial(1000);

        cc.consultarSaldo();
        cc.verificarUsoChequeEspecial();
        cc.depositar(400);
        cc.consultarSaldo();
        cc.sacar(900);
        cc.consultarSaldo();
        cc.verificarUsoChequeEspecial();
        cc.depositar(500);
        cc.consultarSaldo();
        cc.verificarUsoChequeEspecial();
    }
}
