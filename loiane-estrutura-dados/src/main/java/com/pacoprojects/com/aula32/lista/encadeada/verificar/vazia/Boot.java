package main.java.com.pacoprojects.com.aula32.lista.encadeada.verificar.vazia;

import main.java.com.pacoprojects.com.aula32.lista.encadeada.verificar.vazia.model.ListaEncadeada;

public class Boot {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona(3);
        listaEncadeada.adiciona(3);
        listaEncadeada.adiciona(3);
        listaEncadeada.adiciona(4);

        System.out.println("toString => " + listaEncadeada);
        System.out.println("Tamanho: " + listaEncadeada.getTamanho());
        System.out.println("toString => " + listaEncadeada);
        System.out.println();

//        listaEncadeada.limpar();
//        System.out.println("toString => " + listaEncadeada);
//        System.out.println("Tamanho: " + listaEncadeada.getTamanho());

        listaEncadeada.remover(3);
        System.out.println("toString => " + listaEncadeada);
        System.out.println("Tamanho: " + listaEncadeada.getTamanho());

        System.out.println("Está vazio: " + listaEncadeada.estaVazio());
    }
}
