package com.pacoprojects.exercicios.lista.aula37a43.model;

public class Urso extends Mamifero{

    public Urso() {
        setCor("Castanho");
        setAlimento("Mel");
    }

    public Urso(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade, alimento);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAlimento: " + this.getAlimento();
    }
}
