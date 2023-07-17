package com.pacoprojects.exercicios.lista.aula25a27.model;

public class JogoDaVelha {

    char[][] matrizJogo = new char[3][3];
    public String nomeJogador1;
    public String nomeJogador2;
    public boolean ganhou = false;
    public int linha = 0;
    public int coluna = 0;
    public int jogada = 1;
    public char sinal;
    public String ganhador;

    public char[][] getMatrizJogo() {
        return matrizJogo;
    }

    public void setJogadaPosicaoLinhaColuna() {
        if (this.matrizJogo[this.linha][this.coluna] != 'X' || this.matrizJogo[this.linha][this.coluna] != 'O') {
            this.matrizJogo[this.linha][this.coluna] = this.sinal;
            this.jogada++;
        }
    }

    public void exibirJogada() {
        if (jogada % 2 == 1) {
            System.out.println("Vez do jogador 1");
            this.sinal = 'X';
        } else {
            System.out.println("Vez do jogador 2");
            this.sinal = 'O';
        }
    }

    public void verificarGanhador() {
        if ((matrizJogo[0][0] == 'X' && matrizJogo[0][1] == 'X' && matrizJogo[0][2] == 'X') || // Linha 0
                (matrizJogo[1][0] == 'X' && matrizJogo[1][1] == 'X' && matrizJogo[1][2] == 'X') || // Linha 1
                (matrizJogo[2][0] == 'X' && matrizJogo[2][1] == 'X' && matrizJogo[2][2] == 'X') || // Linha 2
                (matrizJogo[0][0] == 'X' && matrizJogo[1][0] == 'X' && matrizJogo[2][0] == 'X') || // Coluna 0
                (matrizJogo[0][1] == 'X' && matrizJogo[1][1] == 'X' && matrizJogo[2][1] == 'X') || // Coluna 1
                (matrizJogo[0][2] == 'X' && matrizJogo[1][2] == 'X' && matrizJogo[2][2] == 'X') || // Coluna 2
                (matrizJogo[0][0] == 'X' && matrizJogo[1][1] == 'X' && matrizJogo[2][2] == 'X')    // Diagonal
        ) {
            System.out.println("Jogador 1 ganhou");
            this.ganhou = true;
            this.ganhador = "Jogador 1";
        } else if ((matrizJogo[0][0] == 'O' && matrizJogo[0][1] == 'O' && matrizJogo[0][2] == 'O') || // Linha 0
                (matrizJogo[1][0] == 'O' && matrizJogo[1][1] == 'O' && matrizJogo[1][2] == 'O') || // Linha 1
                (matrizJogo[2][0] == 'O' && matrizJogo[2][1] == 'O' && matrizJogo[2][2] == 'O') || // Linha 2
                (matrizJogo[0][0] == 'O' && matrizJogo[1][0] == 'O' && matrizJogo[2][0] == 'O') || // Coluna 0
                (matrizJogo[0][1] == 'O' && matrizJogo[1][1] == 'O' && matrizJogo[2][1] == 'O') || // Coluna 1
                (matrizJogo[0][2] == 'O' && matrizJogo[1][2] == 'O' && matrizJogo[2][2] == 'O') || // Coluna 2
                (matrizJogo[0][0] == 'O' && matrizJogo[1][1] == 'O' && matrizJogo[2][2] == 'O')    // Diagonal

        ) {
            System.out.println("Jogador 2 ganhou");
            this.ganhou = true;
            this.ganhador = "Jogador 2";
        } else if (this.jogada >= 9) {
            System.out.println("Ninguem ganhou a partida.");
            this.ganhou = true;
        }
    }


}
