package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        // Área do Quadrado = lado * lado
        int area = this.lado * this.lado;
        System.out.println("Valor da área do quadrado é: " + area);
    }
}
