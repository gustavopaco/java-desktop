package com.pacoprojects.exercicios.lista.aula34.model;

public class Contador {
    private static int count;

    public Contador() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Contador.count = count;
    }

    public void zerarContador() {
        setCount(0);
    }

    public void incrementarContador(int valor) {
        setCount(count + valor);
    }

    public void decrementarContador(int valor) {
        setCount(count - valor);
    }

    public void imprimirContador() {
        System.out.println("O valor do contador é: " + count);
    }
}
