package com.pacoprojects.exercicios.lista.aula16a17;

public class Exercicio4 {
    public static void main(String[] args) {

        // Pais A -> 80.000 Habitantes      / Taxa anual de crescimento 3%
        // Pais B -> 200.000 Habitantes     / Taxa de crescimento 1.5%
        int habitantesPaisA = 80000;
        int habitantesPaisB = 200000;
        int quantidadeAnos = 0;

        while (habitantesPaisA < habitantesPaisB) {

            habitantesPaisA = habitantesPaisA + (int)(habitantesPaisA * 0.03);
            habitantesPaisB = habitantesPaisB + (int)(habitantesPaisB * 0.015);
            quantidadeAnos++;
        }

        System.out.printf("Demorou %d anos para a populacao do pais A que hoje tem %d , igualar ou ultrapassar a populacao do pais B que hoje tem %d", quantidadeAnos, (int)habitantesPaisA, (int)habitantesPaisB);
    }
}
