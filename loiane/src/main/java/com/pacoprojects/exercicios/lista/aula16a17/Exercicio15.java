package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        System.out.println("Sistema que gera serie de fibonaci");

        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.printf("%d, %d, ", primeiroTermo, segundoTermo);
        for (int i = 2; i < 10; i++) {

            int proximoTermo = primeiroTermo + segundoTermo;
            if (i == 9) {
                System.out.printf("%d ", proximoTermo);
            } else {
                System.out.printf("%d, ", proximoTermo);
            }
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
