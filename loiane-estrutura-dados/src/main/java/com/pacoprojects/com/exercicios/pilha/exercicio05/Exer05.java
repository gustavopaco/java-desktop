package main.java.com.pacoprojects.com.exercicios.pilha.exercicio05;

import main.java.com.pacoprojects.com.exercicios.pilha.util.FuncoesUteis;

import java.util.Scanner;

public class Exer05 {
    // 0 1 2 3 4 5 6 7 8
    // A B C D E F G H I    tamanho = 9
    // vet[0] = vet[8]
    // vet[1] = vet[7]
    // vet[2] = vet[6]
    // vet[3] = vet[5]
    // vet[4] = vet[4]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavraEscolhida = FuncoesUteis.lerValorString("Informe uma palavra para verificar se é ou não um palíndromo: ", scanner);

        boolean isPalimdromo = true;
        for (int i = 0, j = palavraEscolhida.length() - 1; i < (palavraEscolhida.toCharArray().length / 2); i++, j--) {
            if (palavraEscolhida.toCharArray()[i] != palavraEscolhida.toCharArray()[j]) {
                isPalimdromo = false;
                break;
            }
        }

        if (isPalimdromo) {
            System.out.println("Palavra: " + palavraEscolhida + " é considerada um palíndromo");
        } else {
            System.out.println("Palavra: " + palavraEscolhida + " não é considerada um palíndromo");
        }

    }
    private static boolean compararPalindromoStringBuilder(String valor) {
        StringBuilder builder = new StringBuilder();
        builder.append(valor);
        return builder.toString().equals(builder.reverse().toString());
    }
}
