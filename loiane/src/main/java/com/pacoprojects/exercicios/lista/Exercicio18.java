package com.pacoprojects.exercicios.lista;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo para download em MB: ");
        double tamanhoArquivo = scanner.nextDouble();
        System.out.println("Informe a velocidade do link de sua internet em MBs: ");
        double velocidadeInternet = scanner.nextDouble();
        double resultadoTempoDownload = tamanhoArquivo / velocidadeInternet;
        double tempEmMinutos = resultadoTempoDownload / 60;
        if (tempEmMinutos < 1) {
            System.out.printf("Voce vai demorar %d segundos para terminar o download", (int)resultadoTempoDownload);
        } else {
            System.out.printf("Voce vai demorar %f.2 minutos para terminar o download", tempEmMinutos);
        }
    }
}
