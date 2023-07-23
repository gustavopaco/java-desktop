package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Circulo extends Figura2D {

    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        // Área do Círculo = π * raio * raio
        return Math.PI * this.raio * this.raio;
    }

    @Override
    public void imprimirArea(double area) {
        System.out.println("O valor da area do circulo é de: " + String.format("%.2f", area));
    }
}
