package com.pacoprojects.exercicios.lista.aula14a15;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos fazer um sistema para calcular as raizes das equacoes de segundo grau! ax² + bx + c");
        System.out.println("Informe o valor de A: ");
        int valorA = scanner.nextInt();
        if (valorA == 0) {
            System.out.println("Com o valor de 0, essa equação nao pode ser considerada de segundo grau. Encerrando o sistema.");
        } else {
            System.out.println("Informe o valor de B: ");
            int valorB = scanner.nextInt();
            System.out.println("Informe o valor de C: ");
            int valorC = scanner.nextInt();

            // Delta b² - 4 * a * c
            int valorDelta = (int)Math.pow(valorB, 2) - 4 * valorA * valorC;

            if (valorDelta < 0) {
                System.out.println("Delta negativo. Essa equação nao possui raizes reais");
            } else if (valorDelta == 0){

                int valorX = (valorB * -1) / (2 * valorA);
                System.out.printf("O delta foi 0 entao a unica raiz é %d", valorX);

            } else {
                // Baskarah x= (-b +/- raiz delta) / 2 * a
                int valorXI = ((valorB * -1) + (int)Math.sqrt(valorDelta)) / (2 * valorA);
                int valorXII = ((valorB * -1) - (int)Math.sqrt(valorDelta)) / (2 * valorA);

                System.out.printf("\nValor da primeira raiz X: %d\n", valorXI);
                System.out.printf("Valor da segunda raiz X: %d\n", valorXII);
            }
        }
    }
}
