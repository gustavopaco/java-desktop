package main.java.com.pacoprojects.com.exercicios.pilha.exercicio06;

import main.java.com.pacoprojects.com.exercicios.pilha.util.FuncoesUteis;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expressao = FuncoesUteis.lerValorString("Informe a expressão matematica: ", scanner);
        int parentesesAbertos = 0;
        int parentesesFechados = 0;
        boolean isValido = true;

        for (int i = 0; i < expressao.toCharArray().length; i++) {
            if (expressao.toCharArray()[i] == '(') {
                parentesesAbertos++;
            }

            if (expressao.toCharArray()[i] == ')') {
                parentesesFechados++;
            }

            if (parentesesFechados > parentesesAbertos) {
                isValido = false;
                break;
            }
        }

        if (parentesesAbertos > parentesesFechados) {
            System.out.println("Expressão viola a condição 1");
        } else if (isValido) {
            System.out.println("Exepressão válida.");
        } else {
            System.out.println("Expressão viola a condição 2");
        }
    }
}
