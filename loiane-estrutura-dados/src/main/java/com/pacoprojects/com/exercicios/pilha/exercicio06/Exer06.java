package main.java.com.pacoprojects.com.exercicios.pilha.exercicio06;

import main.java.com.pacoprojects.com.exercicios.pilha.util.FuncoesUteis;

import java.util.Scanner;
import java.util.Stack;

public class Exer06 {

    final static String ABRE = "{[(";
    final static String FECHA = ")]}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expressao = FuncoesUteis.lerValorString("Informe a expressão matematica: ", scanner);
        System.out.println("Expressão está balanceada? " + verificarExpressaoStack(expressao));
    }

    private static boolean verificarExpressaoStack(String expressao) {
        Stack<Character> pilha = new Stack<>();
        char simbolo, topo;

        for (int i = 0; i < expressao.length(); i++) {
            simbolo = expressao.charAt(i);
            if (ABRE.indexOf(simbolo) > -1) {
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.isEmpty()) {
                    return false;
                } else {
                   topo = pilha.pop();
                   if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                       return false;
                   }
                }
            }
        }
        return pilha.isEmpty();
    }

    private static void verificarExpressao(String expressao) {
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
