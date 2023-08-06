package main.java.com.pacoprojects.com.aula14.pilha.empilhar.elemento;

import main.java.com.pacoprojects.com.aula14.pilha.empilhar.elemento.model.Pilha;

public class Boot {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        for (int i = 1; i <= 10; i++) {
            pilha.empilhar(i);
        }
        System.out.println(pilha);
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
    }
}
