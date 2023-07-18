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

    public void exibirJogada() {
        if (jogada % 2 == 1) {
            System.out.println("Vez do jogador 1");
            this.sinal = 'X';
        } else {
            System.out.println("Vez do jogador 2");
            this.sinal = 'O';
        }
    }

    public void setJogadaPosicaoLinhaColuna() {
        if (this.matrizJogo[this.linha][this.coluna] != 'X' && this.matrizJogo[this.linha][this.coluna] != 'O') {
            this.matrizJogo[this.linha][this.coluna] = this.sinal;
            this.jogada++;
        } else {
            System.out.println("Jogada inválida, esta linha e coluna já foi marcada.");
        }
    }

    public boolean verificarGanhador() {
        if (isJogadorGanhou()) {
            this.ganhou = true;
            if (this.sinal == 'X') {
                this.ganhador = this.nomeJogador1;
            } else {
                this.ganhador = this.nomeJogador2;
            }
            return true;
        } else if (this.jogada > 9) {
            this.ganhou = true;
            return true;
        }
        return false;
    }

    private boolean isJogadorGanhou() {
        if ((matrizJogo[0][0] == this.sinal && matrizJogo[0][1] == this.sinal && matrizJogo[0][2] == this.sinal) || // Linha 0
                (matrizJogo[1][0] == this.sinal && matrizJogo[1][1] == this.sinal && matrizJogo[1][2] == this.sinal) || // Linha 1
                (matrizJogo[2][0] == this.sinal && matrizJogo[2][1] == this.sinal && matrizJogo[2][2] == this.sinal) || // Linha 2
                (matrizJogo[0][0] == this.sinal && matrizJogo[1][0] == this.sinal && matrizJogo[2][0] == this.sinal) || // Coluna 0
                (matrizJogo[0][1] == this.sinal && matrizJogo[1][1] == this.sinal && matrizJogo[2][1] == this.sinal) || // Coluna 1
                (matrizJogo[0][2] == this.sinal && matrizJogo[1][2] == this.sinal && matrizJogo[2][2] == this.sinal) || // Coluna 2
                (matrizJogo[0][0] == this.sinal && matrizJogo[1][1] == this.sinal && matrizJogo[2][2] == this.sinal) || // Diagonal 1
                (matrizJogo[2][0] == this.sinal && matrizJogo[1][1] == this.sinal && matrizJogo[0][2] == this.sinal)    // Diagonal 2
        ) {
            return true;
        }
        return false;
    }

    public void imprimirTabuleiro() {
        System.out.println("Matriz:");
        for (int i = 0; i < getMatrizJogo().length; i++) {
            for (int j = 0; j < getMatrizJogo()[i].length; j++) {
                System.out.print(getMatrizJogo()[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
