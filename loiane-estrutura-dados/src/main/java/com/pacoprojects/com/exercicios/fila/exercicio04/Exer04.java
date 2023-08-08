package main.java.com.pacoprojects.com.exercicios.fila.exercicio04;

import main.java.com.pacoprojects.com.exercicios.fila.exercicio04.model.Fila;

import java.util.Queue;
import java.util.Random;

public class Exer04 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        for (int i = 1; i <= 10; i++) {
            fila.enfileira(i);
        }

        Random random = new Random();
        int numero = random.nextInt(1,11);

        System.out.println("Número: " + numero);

        while (fila.tamanho() > 1) {
            for (int i = 0; i < numero; i++) {
                fila.enfileira(fila.desenfileira());
            }
            System.out.println("Eliminado: " + fila.desenfileira());
        }
        System.out.println("Ganhador: " + fila.desenfileira());
    }
}
