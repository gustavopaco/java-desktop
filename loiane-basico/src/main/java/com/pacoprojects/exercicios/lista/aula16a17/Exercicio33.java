package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        System.out.println("Programa que recebe N temperaturas e informa qual foi a maior, menor e a media de temperaturas.");
        Scanner scanner = new Scanner(System.in);
        double maiorTemperatura = Integer.MIN_VALUE;
        double menorTemperatura = Integer.MAX_VALUE;
        double mediaTemperatura = 0;
        int quantidadeTemperaturasInformadas = 1;
        while (true) {
            System.out.println("Informe o valor da temperatura: ");
            double valorTemp = scanner.nextDouble();

            maiorTemperatura = Math.max(maiorTemperatura, valorTemp);
            menorTemperatura = Math.min(menorTemperatura, valorTemp);
            mediaTemperatura += valorTemp;
            quantidadeTemperaturasInformadas++;

            System.out.println("Continuar informando temperaturas? 'S' -> Sim, 'N' -> Não");
            char continuar = scanner.next().charAt(0);
            if (continuar == 'n' || continuar == 'N') {
                break;
            }
        }

        mediaTemperatura = menorTemperatura / quantidadeTemperaturasInformadas;
        System.out.println("Maior temperatura registrada: " + maiorTemperatura);
        System.out.println("Menor temperatura registrada: " + menorTemperatura);
        System.out.println("Media de temperaturas informadas: " + mediaTemperatura);
    }
}
