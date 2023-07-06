package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        System.out.println("Sistema que calcula valor total investido em uma colecao de CDs e o valor medio de cada um deles. O usuario deve informar a quantidade de CDs e o valo para cada um.");
        System.out.println("Informe a quantidade de CDs da colecao.");
        Scanner scanner = new Scanner(System.in);
        int quantidadeCDsColecao = scanner.nextInt();
        double totalInvestido = 0;
        double mediaValorCDs = 0;

        for (int i = 0; i < quantidadeCDsColecao; i++) {
            System.out.println("Informe o valor do CD " + (quantidadeCDsColecao + 1) + ":");
            int valorCD = scanner.nextInt();

            totalInvestido += valorCD;
            mediaValorCDs += valorCD;
        }

        mediaValorCDs = mediaValorCDs / quantidadeCDsColecao;
        System.out.printf("O valor total investido na coleção de CDs foi: %.2f e a media do valor de cada CD foi: %.2f", totalInvestido, mediaValorCDs);
    }
}
