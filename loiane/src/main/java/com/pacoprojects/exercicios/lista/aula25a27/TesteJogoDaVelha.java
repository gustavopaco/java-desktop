package com.pacoprojects.exercicios.lista.aula25a27;

import com.pacoprojects.exercicios.lista.aula25a27.model.JogoDaVelha;

import java.util.Scanner;

public class TesteJogoDaVelha {
    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogador 1 - X");
        System.out.println("Jogador 2 - O");

        while (!jogoDaVelha.ganhou) {

            jogoDaVelha.exibirJogada();

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Informe a linha para jogar (1, 2 ou 3)");
                jogoDaVelha.linha = scanner.nextInt();

                if (jogoDaVelha.linha >= 1 && jogoDaVelha.linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Jogada inválida, tente novamente.");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Informe a coluna para jogar (1, 2 ou 3)");
                jogoDaVelha.coluna = scanner.nextInt();

                if (jogoDaVelha.coluna >= 1 && jogoDaVelha.coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Jogada inválida, tente novamente.");
                }
            }

            jogoDaVelha.linha--;
            jogoDaVelha.coluna--;
            jogoDaVelha.setJogadaPosicaoLinhaColuna();

            jogoDaVelha.verificarGanhador();

            System.out.println("Matriz:");
            for (int i = 0; i < jogoDaVelha.getMatrizJogo().length; i++) {
                for (int j = 0; j < jogoDaVelha.getMatrizJogo()[i].length; j++) {
                    System.out.print(jogoDaVelha.getMatrizJogo()[i][j] + " | ");
                }
                System.out.println();
            }
        }
    }
}
