package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidadeMaiorIndiceAcidentes = 0;
        int numeroAcidentesMenor = Integer.MAX_VALUE;
        int numeroAcidentesMaior = Integer.MIN_VALUE;
        int codigoCidadeMenorIndiceAcidentes = 0;
        double mediaVeiculos = 0;
        double mediaAcidentes = 0;
        int quantidadeMediaAcidentes = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o código da cidade: ");
            int codigoCidade = scanner.nextInt();

            System.out.println("Número de veículos de passeio: ");
            int numeroVeiculos = scanner.nextInt();
            mediaVeiculos += numeroVeiculos;

            System.out.println("Número de acidentes de trânsito com vítimas: ");
            int numeroAcidentes = scanner.nextInt();

            if (numeroVeiculos < 2000) {
                mediaAcidentes += numeroAcidentes;
                quantidadeMediaAcidentes++;
            }

            if (numeroAcidentes > numeroAcidentesMaior) {
                numeroAcidentesMaior = numeroAcidentes;
                codigoCidadeMaiorIndiceAcidentes = codigoCidade;
            }

            if (numeroAcidentes < numeroAcidentesMenor) {
                numeroAcidentesMenor = numeroAcidentes;
                codigoCidadeMenorIndiceAcidentes = codigoCidade;
            }

        }

        mediaVeiculos = mediaVeiculos / 5;
        mediaAcidentes = mediaAcidentes / quantidadeMediaAcidentes;

        System.out.printf("\nO MENOR índice de acidentes de transito foi de: %d e pertence a cidade de código: %d", numeroAcidentesMenor, codigoCidadeMenorIndiceAcidentes);
        System.out.printf("\nO MAIOR índice de acidentes de transito foi de: %d e pertence a cidade de código: %d", numeroAcidentesMaior, codigoCidadeMaiorIndiceAcidentes);
        System.out.printf("\nA média de veículos nas cinco cidades juntas foi de: %.2f", mediaVeiculos);
        System.out.printf("\nA média de acidentes de transito nas cidades com meno de 2.000 veiculos foi de: " + mediaAcidentes);
    }
}
