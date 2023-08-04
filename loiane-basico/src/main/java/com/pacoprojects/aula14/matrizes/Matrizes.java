package com.pacoprojects.aula14.matrizes;

public class Matrizes {
    public static void main(String[] args) {
        double[][] notasAlunos = new double[30][4];

        for (int i = 0; i < notasAlunos.length; i++) {
            double media = 0;
            System.out.println("###############");
            System.out.println("Aluno " + (i+1) + ": ");
            System.out.println("###############");
            System.out.print("Notas: ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                notasAlunos[i][j] = Math.random() * 10;
                System.out.printf("%.2f ",notasAlunos[i][j]);
                media += notasAlunos[i][j];
            }
            System.out.println();
            media = media / 4;
            System.out.println("Media: " + String.format("%.2f", media));
        }

//        for (double[] d : notasAlunos) {
//            for (double nota : d) {
//                System.out.print(nota + " ");
//            }
//            System.out.println();
//        }
    }
}
