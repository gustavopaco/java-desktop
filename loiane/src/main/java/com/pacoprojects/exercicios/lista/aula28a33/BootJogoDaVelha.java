package com.pacoprojects.exercicios.lista.aula28a33;

import com.pacoprojects.exercicios.lista.aula28a33.model.JogoDaVelha;

import java.util.Scanner;

public class BootJogoDaVelha {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        exibirIntro();
        jogoDaVelha.setNomeJogador1(lerNomeJogadores(1));
        jogoDaVelha.setNomeJogador2(lerNomeJogadores(2));
        boolean ganhou = false;
        while (!ganhou) {
            jogoDaVelha.exibirJogada();
            int linha = obterLinhaColuna(true);
            int coluna = obterLinhaColuna(false);
            char sinal = jogoDaVelha.obterSinalJogada();
            jogoDaVelha.setarJogadaLinhaColuna(linha, coluna, sinal);
            ganhou = jogoDaVelha.verificarGanhador(sinal);
            jogoDaVelha.imprimirTabuleiro();
        }
        imprimirVencedor(jogoDaVelha.getNomeGanhador());
    }

    private static void exibirIntro() {
        System.out.println("Jogo da Velha");
        System.out.println("Jogador 1 - X");
        System.out.println("Jogador 2 - O");
    }

    public static String lerNomeJogadores(int numJogador) {
        System.out.println("Informe o nome do jogador " + numJogador + ":");
        return scanner.nextLine();
    }

    private static int obterLinhaColuna(boolean isLinha) {
        int valor = 0;
        boolean isValido = false;
        while (!isValido) {
            if (isLinha) {
                System.out.println("Informe a posição da linha (1, 2 ou 3):");
            } else {
                System.out.println("Informe a posição da coluna (1, 2 ou 3):");
            }
            valor = scanner.nextInt();
            scanner.nextLine();
            if (valor >= 1 && valor <= 3) {
                isValido = true;
            }
        }
        valor--;
        return valor;
    }

    private static void imprimirVencedor(String nomeVencedor) {
        if (!nomeVencedor.isBlank()) {
            System.out.println("O jogador " + nomeVencedor + " venceu a partida!");
        } else {
            System.out.println("Não ouve vencedores, o jogo deu velha!");
        }
    }
}
