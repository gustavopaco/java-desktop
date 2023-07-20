package com.pacoprojects.exercicios.lista.aula35.model;

public class Recursividade {
    public static int fibonacci(int num) {
       if (num < 2) {
           return num;
       }
       return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int calcularSomatorio(int num) {
        if (num == 1) {
            return 1;
        }
        return num + (calcularSomatorio(num - 1));
    }

    public static void fibo(long num) {
        long atual = 0;      // atual
        long anterior = 0;    // anterior

        for (int i = 0; i <= num; i++) {
            if (i == 1) {
                atual = 1;
            } else {
                atual = atual + anterior;
                anterior = atual - anterior;
            }
            System.out.print(atual + " ");
        }
    }
}
