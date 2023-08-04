package com.pacoprojects.exercicios.lista.aula25a27;

import com.pacoprojects.exercicios.lista.aula25a27.model.JogoDaVelha;

import java.util.Scanner;

public class TesteJogoDaVelha {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 - X");
        System.out.println("Jogador 2 - O");

        System.out.println("Qual o nome do jogador 1? ");
        jogoDaVelha.nomeJogador1 = scanner.nextLine();

        System.out.println("Qual o nome do jogador 2? ");
        jogoDaVelha.nomeJogador2 = scanner.nextLine();

        while (!jogoDaVelha.ganhou) {

            jogoDaVelha.exibirJogada();

            jogoDaVelha.linha = valorLinhaColuna();
            jogoDaVelha.coluna = valorLinhaColuna();

            jogoDaVelha.setJogadaPosicaoLinhaColuna();

            boolean hasGanhador = jogoDaVelha.verificarGanhador();

            if (hasGanhador && !jogoDaVelha.ganhador.isBlank()) {
                System.out.println("Fim de jogo. "+ jogoDaVelha.ganhador + " ganhou!");
            }

            jogoDaVelha.imprimirTabuleiro();
        }
    }

    private static int valorLinhaColuna() {
        boolean linhaColunaValida = false;
        int valor = 0;
        while (!linhaColunaValida) {
            System.out.println("Informe a linha para jogar (1, 2 ou 3)");
            valor = scanner.nextInt();

            if (valor >= 1 && valor <= 3) {
                linhaColunaValida = true;
            } else {
                System.out.println("Jogada inválida, tente novamente.");
            }
        }
        valor--;
        return valor;
    }
}
