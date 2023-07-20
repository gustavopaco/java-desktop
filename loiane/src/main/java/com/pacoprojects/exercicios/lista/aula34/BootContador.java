package com.pacoprojects.exercicios.lista.aula34;

import com.pacoprojects.exercicios.lista.aula34.model.Contador;

public class BootContador {
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.imprimirContador();
        new Contador();
        contador.imprimirContador();
        contador.incrementarContador(5);
        contador.imprimirContador();
        contador.decrementarContador(1);
        contador.imprimirContador();
        contador.zerarContador();
        contador.imprimirContador();

    }
}
