package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Quadrado extends Figura2D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // Área do Quadrado = lado * lado
        return this.lado * this.lado;
    }

    @Override
    public void imprimirArea(double area) {
        System.out.println("O valor da área do quadrado é: " + String.format("%.2f", area));
    }
}
