package com.pacoprojects.aula14.matrizes;

import java.util.Scanner;

public class MatrizesIrregulares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero de pessoas entrevistadas: ");
        int numEntrevistados = scanner.nextInt();
        String[][] pesquisaFilhos = new String[numEntrevistados][];

        for (int i = 0; i < pesquisaFilhos.length; i++) {
            System.out.println("Informe a quantidade de filhos ou entre com valor negativo para parar o sistema:");
            int qtdFilhos = scanner.nextInt();
            if (qtdFilhos < 0) {
                break;
            }
            pesquisaFilhos[i] = new String[qtdFilhos];
            for (int j = 0; j <  pesquisaFilhos[i].length; j++) {
                System.out.println("Informe o nome de cada filho: ");
                String nomeFilho = scanner.next();
                pesquisaFilhos[i][j] = nomeFilho;
            }
        }


        for (int i = 0; i < pesquisaFilhos.length; i++) {
            System.out.println("\nPessoa " + (i + 1) + " tem " + pesquisaFilhos[i].length + " filhos. Seus nomes sao: ");
            for (int j = 0; j < pesquisaFilhos[i].length; j++) {
                System.out.printf("%s  ", pesquisaFilhos[i][j]);
            }
        }
    }
}
