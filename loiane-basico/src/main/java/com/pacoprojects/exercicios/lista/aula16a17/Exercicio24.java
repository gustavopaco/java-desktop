package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNotas = 0;
        System.out.println("Sistema que recebe N notas e calcula a media quando usuario decidir parar de informar notas");
        double resultado = 0;
        while (true) {
            System.out.println("Informe o valor da nota: " + (quantidadeNotas+1));
            resultado += scanner.nextDouble();
            quantidadeNotas++;

            System.out.println("Deseja continuar informando notas? 'S' -> Sim, 'N' -> Não");
            char continuar = scanner.next().charAt(0);

            if (continuar == 'N' || continuar == 'n') {
                break;
            }
        }

        resultado = resultado / quantidadeNotas;
        System.out.println("A média de todas as notas foi: " + resultado);
    }
}
