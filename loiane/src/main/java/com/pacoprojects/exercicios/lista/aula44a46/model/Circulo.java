package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Circulo extends Figura2D implements DimensaoSuperficial {

    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        // Área do Círculo = π * raio * raio
        double area = Math.PI * this.raio * this.raio;
        System.out.println("O valor da area do circulo é de: " + String.format("%.2f", area));
    }
}
