package com.pacoprojects.exercicios.lista.aula28a33.model;

public class JogoDaVelha {
    private final char[][] tabuleiro = new char[3][3];
    private int jogada = 1;
    private String nomeJogador1;
    private String nomeJogador2;
    private String nomeGanhador;

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public String getNomeJogador1() {
        return nomeJogador1;
    }

    public void setNomeJogador1(String nomeJogador1) {
        this.nomeJogador1 = nomeJogador1;
    }

    public String getNomeJogador2() {
        return nomeJogador2;
    }

    public void setNomeJogador2(String nomeJogador2) {
        this.nomeJogador2 = nomeJogador2;
    }

    public String getNomeGanhador() {
        return nomeGanhador;
    }

    public void setNomeGanhador(String nomeGanhador) {
        this.nomeGanhador = nomeGanhador;
    }

    public void exibirJogada() {
        if (this.jogada % 2 == 1) {
            System.out.println("Vez do jogador " + nomeJogador1);
        } else {
            System.out.println("Vez do jogador " + nomeJogador2);
        }
    }

    public char obterSinalJogada() {
        if (this.jogada % 2 == 1) {
            return 'X';
        }
        return 'O';
    }

    public String obterJogadorPorSinal(char sinal) {
        if (sinal == 'X') {
            return this.nomeJogador1;
        }
        return this.nomeJogador2;
    }

    public void setarJogadaLinhaColuna(int linha, int coluna, char sinal) {
        if (this.tabuleiro[linha][coluna] != sinal && this.tabuleiro[linha][coluna] != sinal) {
            this.tabuleiro[linha][coluna] = sinal;
            this.jogada++;
        } else {
            System.out.println("Jogada inválida! Tente novamente.");
        }
    }

    public boolean verificarGanhador(char sinal) {
        if (    (this.tabuleiro[0][0] == sinal && this.tabuleiro[0][1] == sinal && this.tabuleiro[0][2] == sinal) || // Linha 1
                (this.tabuleiro[1][0] == sinal && this.tabuleiro[1][1] == sinal && this.tabuleiro[1][2] == sinal) || // Linha 2
                (this.tabuleiro[2][0] == sinal && this.tabuleiro[2][1] == sinal && this.tabuleiro[2][2] == sinal) || // Linha 3
                (this.tabuleiro[0][0] == sinal && this.tabuleiro[1][0] == sinal && this.tabuleiro[2][0] == sinal) || // Coluna 1
                (this.tabuleiro[0][1] == sinal && this.tabuleiro[1][1] == sinal && this.tabuleiro[2][1] == sinal) || // Coluna 2
                (this.tabuleiro[0][2] == sinal && this.tabuleiro[1][2] == sinal && this.tabuleiro[2][2] == sinal) || // Coluna 3
                (this.tabuleiro[0][0] == sinal && this.tabuleiro[1][1] == sinal && this.tabuleiro[2][2] == sinal) || // Diagonal 1
                (this.tabuleiro[2][0] == sinal && this.tabuleiro[1][1] == sinal && this.tabuleiro[0][2] == sinal)    // Diagonal 2
        ) {
            this.nomeGanhador = obterJogadorPorSinal(sinal);
            return true;
        }
        if (this.jogada > 9) {
            return true;
        }
        return false;
    }

    public void imprimirTabuleiro() {
        System.out.println("TABULEIRO:");
        for (int i = 0; i < this.tabuleiro.length; i++) {
            for (int j = 0; j < this.tabuleiro[i].length; j++) {
                System.out.print(this.tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
