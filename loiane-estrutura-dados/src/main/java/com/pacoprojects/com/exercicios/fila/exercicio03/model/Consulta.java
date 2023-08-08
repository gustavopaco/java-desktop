package main.java.com.pacoprojects.com.exercicios.fila.exercicio03.model;

import java.util.Random;

public class Consulta {
    public static final int TEMPO_CONSULTA = 5;
    public static final int TEMPO_PROX_CONSULTA = 4;
    public static int NUM_FILA = 0;

    public static CodAtendimento gerarCodigAleatorio() {
        Random random = new Random();
        int valor = random.nextInt(1,4);
        switch (valor) {
            case 1 -> {
                return CodAtendimento.VERMELHO;
            }
            case 2 -> {
                return CodAtendimento.AMARELO;
            }
            default -> {
                return CodAtendimento.VERDE;
            }
        }
    }

    public static int novoNumeroFila() {
        return NUM_FILA++;
    }
}
