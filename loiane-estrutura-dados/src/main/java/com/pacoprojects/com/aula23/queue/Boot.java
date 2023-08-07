package main.java.com.pacoprojects.com.aula23.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Boot {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        System.out.println("toString => " + fila);
        System.out.println("Está vazia: " + fila.isEmpty());

        System.out.println();
        System.out.println("Adicionando elementos...");

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);

        System.out.println("toString => " + fila);
        System.out.println("Está vazia: " + fila.isEmpty());
        System.out.println("Tamanho: " + fila.size());
        System.out.println("Espiar elemento do inicio da fila: " + fila.peek());

        System.out.println("Desenfileirando elemento do inicio da fila... " + fila.peek());
        fila.remove();
        System.out.println("toString => " + fila);
        System.out.println("Desenfileirando outro elemento do inicio da fila... " + fila.peek());
        fila.remove();
        System.out.println("toString => " + fila);
    }
}
