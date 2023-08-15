package main.java.com.pacoprojects.com.aula33.lista.encadeada.existe.vazia;

import main.java.com.pacoprojects.com.aula33.lista.encadeada.existe.vazia.model.ListaEncadeada;

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

        int elemento = 4;
        if (listaEncadeada.existe(elemento) > 0) {
            System.out.println("Existe o elemento " + elemento + " na lista encadeada");
        } else {
            System.out.println("Não existe o elemento na lista encadeada");
        }
    }
}
