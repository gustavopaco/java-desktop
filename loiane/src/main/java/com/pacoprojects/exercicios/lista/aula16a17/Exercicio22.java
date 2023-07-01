package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que verifica se um numero é considerado um numero primo ou não.");
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();
        int contadorPrimo = 0;
        StringBuilder numerosDivisiveis = new StringBuilder();

        numerosDivisiveis.append("Esse número não é primo pois ele é divisível por: ");
        for (int i = 1; i <= numero ; i++) {
            if ((numero % i) == 0) {
                contadorPrimo++;
                numerosDivisiveis.append(i).append(" ");
            }
        }


//        for (int i = 1; i <= Math.sqrt(numero); i++) {
//            if ((numero % i) == 0) {
//                contadorPrimo += 2; // Incrementa 2 no contador, considerando o fator e o seu correspondente
//            }
//        }


        if (contadorPrimo == 2) {
            System.out.println("É um numero primo.");
        } else {
            System.out.println("Não é um numero primo.");
            System.out.println(numerosDivisiveis);
        }
    }
}
