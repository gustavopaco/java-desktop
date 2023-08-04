package com.pacoprojects.exercicios.lista.aula16a17;

public class Exercicio16 {
    public static void main(String[] args) {

        int primeiroNumero = 0;
        int segundoNumero = 1;
        int proximoNumero = 0;

        System.out.printf("Serie Fibonacci: %d, %d", primeiroNumero, segundoNumero);
        do {
            proximoNumero = primeiroNumero + segundoNumero;
            System.out.printf("%d, ", proximoNumero);
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        } while (proximoNumero < 500);
    }
}
