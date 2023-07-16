package com.pacoprojects.aula15.loop.foreach;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int[] notas = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        for (int nota : notas) {
            System.out.print(nota + " | ");
        }
        
        int notasAlunos[][] = new int[30][4];

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                notasAlunos[i][j] = random.nextInt(10);
            }
        }
        for (int[] notaI : notasAlunos) {
            for (int notaJ : notaI) {
                System.out.print(notaJ + " | ");
            }
            System.out.println();
        }
    }
}
