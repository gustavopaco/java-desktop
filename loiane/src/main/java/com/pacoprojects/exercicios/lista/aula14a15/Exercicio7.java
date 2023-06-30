package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro numero:");
        double numero1 = scanner.nextDouble();
        System.out.println("Informe o valor do segundo numero:");
        double numero2 = scanner.nextDouble();
        System.out.println("Informe o valor do terceiro numero:");
        double numero3 = scanner.nextDouble();
        double maior = Math.max(numero1, numero2);
        maior = Math.max(maior, numero3);
        double menor = Math.min(numero1, numero2);
        menor = Math.min(menor, numero3);
        System.out.printf("Entre os numeros %.2f, %.2f e %.2f. O maior é %.2f e o menor é %.2f.", numero1, numero2, numero3, maior, menor);
    }
}
