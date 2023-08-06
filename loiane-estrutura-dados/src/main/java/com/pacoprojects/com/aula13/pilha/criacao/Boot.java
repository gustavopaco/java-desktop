package main.java.com.pacoprojects.com.aula13.pilha.criacao;

import main.java.com.pacoprojects.com.aula13.pilha.criacao.model.Lista;
import main.java.com.pacoprojects.com.aula13.pilha.criacao.model.Pilha;

public class Boot {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        Lista<String> lista = new Lista<>();
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista);
        System.out.println(lista.tamanho());

        lista.remover(1);
        System.out.println(lista);
        System.out.println(lista.tamanho());
    }
}
