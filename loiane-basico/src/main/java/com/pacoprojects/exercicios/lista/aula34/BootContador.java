package com.pacoprojects.exercicios.lista.aula34;

import com.pacoprojects.exercicios.lista.aula34.model.Contador;

public class BootContador {
    public static void main(String[] args) {
        Contador.imprimirContador();
        Contador.incrementarContador(1);
        Contador.imprimirContador();
        Contador.incrementarContador(5);
        Contador.imprimirContador();
        Contador.decrementarContador(1);
        Contador.imprimirContador();
        Contador.zerarContador();
        Contador.imprimirContador();

    }
}
