package com.pacoprojects.exercicios.lista.aula37a43.model;

public class Urso extends Mamifero{

    public Urso() {
    }

    public Urso(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade, alimento);
    }

    @Override
    public String getAlimento() {
        return "Mel";
    }
}
