package com.pacoprojects.exercicios.lista.aula16a17;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Existem 3 candidatos a uma eleicao. O usuario deve informar o numero total de eleitores e para cada eleitor, o usuario deve informar o candidato que sera votado. No fim o sistema ira mostrar a quantidade de votos de cada usuario.");
        System.out.println("Informe a quantidade total de eleitores.");
        int numeroTotalEleitores = scanner.nextInt();
        int numeroVotosCandidato1 = 0;
        int numeroVotosCandidato2 = 0;
        int numeroVotosCandidato3 = 0;

        for (int i = 0; i < numeroTotalEleitores; i++) {

            System.out.println("Informe a qual candidato o eleitor: " + (i + 1) + " irá votar. \nCandidato '1' -> Fulano, '2' -> Beltrano, '3' -> Ciclano: ");
            int voto = scanner.nextInt();

            if (voto == 1) {
                numeroVotosCandidato1++;
            } else if (voto == 2) {
                numeroVotosCandidato2++;
            } else if (voto == 3) {
                numeroVotosCandidato3++;
            } else {
                System.out.println("*****************************************");
                System.out.println("Voce informou um valor invalido para o candidato");
                System.out.println("*****************************************");
                i--;
            }
            System.out.println("----------------------------------------");
        }

        System.out.println("Chegou ao fim a eleicao. Aqui segue os numeros de votos de cada candidato: \nCandidato 1: " + numeroVotosCandidato1 + " votos. \nCandidato 2: " + numeroVotosCandidato2 + " votos. \nCandidato 3: " + numeroVotosCandidato3 + " votos.");
    }
}
