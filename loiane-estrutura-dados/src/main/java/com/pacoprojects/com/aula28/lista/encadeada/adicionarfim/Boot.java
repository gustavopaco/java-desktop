package main.java.com.pacoprojects.com.aula28.lista.encadeada.adicionarfim;

import main.java.com.pacoprojects.com.aula28.lista.encadeada.adicionarfim.model.ListaEncadeada;

public class Boot {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona(1);
        listaEncadeada.adiciona(2);
        listaEncadeada.adiciona(3);

        System.out.println("toString => " + listaEncadeada);
        System.out.println("Tamanho: " + listaEncadeada.getTamanho());
    }
}
