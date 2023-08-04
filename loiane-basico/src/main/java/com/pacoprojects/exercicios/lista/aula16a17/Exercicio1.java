package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;
        do {
            System.out.println("Informe uma nota de 0 a 10");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor de nota invalida. Encerrando o sistema...");
            }
        } while (nota < 0 || nota > 10);

//        int nota2 = -1;
//        while (nota2 < 0 || nota2 > 10) {
//            System.out.println("Informe uma nota de 0 a 10");
//            nota2 = scanner.nextInt();
//            if (nota2 < 0 || nota2 > 10) {
//                System.out.println("Valor de nota invalida. Encerrando o sistema...");
//            }
//        }
    }
}
