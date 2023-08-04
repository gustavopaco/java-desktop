package com.pacoprojects.exercicios.lista.aula37a43;

import com.pacoprojects.exercicios.lista.aula37a43.model.ContaEspecial;
import com.pacoprojects.exercicios.lista.aula37a43.model.ContaPoupanca;

public class BootContaCorrente {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumConta("12345");
        contaPoupanca.setDiaRendimento(22);
        contaPoupanca.setNomeCliente("Fulano da Silva");
        contaPoupanca.setSaldo(1000);

        System.out.println();
        System.out.println("--------------");
        System.out.println("Conta Poupança");
        System.out.println("--------------");
        System.out.println(contaPoupanca);
        System.out.println("--------------");

        contaPoupanca.consultarSaldo();
        contaPoupanca.calcularNovoSaldo(1.5);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(500);
        contaPoupanca.consultarSaldo();
        contaPoupanca.calcularNovoSaldo(5);
        contaPoupanca.consultarSaldo();
        contaPoupanca.sacar(2000);
        contaPoupanca.consultarSaldo();


        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNumConta("98765");
        contaEspecial.setLimite(1000);
        contaEspecial.setNomeCliente("Beltrano");
        contaEspecial.setSaldo(500);

        System.out.println();
        System.out.println("--------------");
        System.out.println("Conta Especial");
        System.out.println("--------------");
        System.out.println(contaEspecial);
        System.out.println("--------------");

        contaEspecial.consultarSaldo();
        contaEspecial.depositar(800);
        contaEspecial.consultarSaldo();
        contaEspecial.sacar(1500);
        contaEspecial.consultarSaldo();
        contaEspecial.sacar(300);
        contaEspecial.consultarSaldo();
        contaEspecial.sacar(500);
        contaEspecial.consultarSaldo();
        contaEspecial.sacar(1);
        contaEspecial.consultarSaldo();
    }
}
