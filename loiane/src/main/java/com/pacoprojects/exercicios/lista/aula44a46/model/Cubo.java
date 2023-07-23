package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        // Área do Cubo = 6 * (lado * lado)
        int area = 6 * (this.lado * this.lado);
        System.out.println("O valor da área do cubo é de " + area);
    }

    @Override
    public void calcularVolume() {
        // Volume do Cubo = lado * lado * lado
        int volume = this.lado * this.lado * this.lado;
        System.out.println("O valor do volume de um cubo é: " + volume);
    }
}
