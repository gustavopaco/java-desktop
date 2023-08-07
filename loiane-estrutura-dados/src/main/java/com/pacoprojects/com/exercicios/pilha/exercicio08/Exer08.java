package main.java.com.pacoprojects.com.exercicios.pilha.exercicio08;

import java.util.Stack;

public class Exer08 {
    public static void main(String[] args) {
        Stack<Integer> origem = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        origem.push(3);
        origem.push(2);
        origem.push(1);

        torreHanoi(origem.size(), origem, destino, auxiliar);
    }

    public static void torreHanoi(int numdiscos, Stack<Integer> origem, Stack<Integer> destino, Stack<Integer> auxiliar) {
        if (numdiscos > 0) {
            torreHanoi(numdiscos -1, origem, auxiliar, destino);
            destino.push(origem.pop());
            System.out.println("---------");
            System.out.println("Origem: " + origem);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreHanoi(numdiscos -1, auxiliar, destino, origem);
        }
    }
}
