package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        System.out.println("Sistema que monta tabuada de numero inteiro informado pelo usuario ate um numero inteiro informado pelo usuario");
        System.out.println("Informe qual numero inteiro a tabuada sera gerada: ");
        Scanner scanner = new Scanner(System.in);
        int numeroTabuada = scanner.nextInt();
        System.out.println("Informe agora de qual numero da tabuada de " + numeroTabuada + " gostaria de iniciar: ");
        int inicioTabuada = scanner.nextInt();
        System.out.println("Agora informe ate qual numero inteiro a tabuada de " + numeroTabuada + " deve ser gerado: ");
        int maximoTabuada = scanner.nextInt();

        if (inicioTabuada <= maximoTabuada) {
            System.out.println("Montar a tabuada de: " + numeroTabuada);
            System.out.println("Começar por " + inicioTabuada);
            System.out.println("Terminar em: " + maximoTabuada + "\n");
            System.out.println("Vou montar a tabuada de " + numeroTabuada + " começando em " + inicioTabuada + " e terminando em " + maximoTabuada + ":");

            for (int i = inicioTabuada; i <= maximoTabuada; i++) {
                System.out.printf("%d X %d = %d\n", numeroTabuada, i, (numeroTabuada * i));
            }
        } else {
            System.out.println("Você informou um numero final da tabuada menor que o numero inicial. Encerrando sistema...");
        }
    }
}
