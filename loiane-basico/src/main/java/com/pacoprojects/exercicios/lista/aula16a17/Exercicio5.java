package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pais A -> 80.000 Habitantes      / Taxa anual de crescimento 3%
        // Pais B -> 200.000 Habitantes     / Taxa de crescimento 1.5%

        System.out.println("Sistema que informa a quantidade de anos que um País A com taxa de crescimento de Habitantes a 3% ao ano, demoraria para alcancar o numero de Habitantes de um País B com taxa de crescimento de Habitantes a 1.5% ao ano");
        System.out.println("Informe a quantidade de habitantes do pais A");
        int habitantesPaisA = scanner.nextInt();
        System.out.println("Informe a quantidade de habitantes do pais B");
        int habitantesPaisB = scanner.nextInt();
        int quantidadeAnos = 0;

        while (habitantesPaisA < habitantesPaisB) {

            habitantesPaisA = habitantesPaisA + (int)(habitantesPaisA * 0.03);
            habitantesPaisB = habitantesPaisB + (int)(habitantesPaisB * 0.015);
            quantidadeAnos++;
        }

        System.out.printf("Demorou %d anos para a populacao do pais A que hoje tem %d , igualar ou ultrapassar a populacao do pais B que hoje tem %d", quantidadeAnos, (int)habitantesPaisA, (int)habitantesPaisB);
    }
}
