package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Cubo extends Figura3D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // Área do Cubo = 6 * (lado * lado)
        return  6 * (this.lado * this.lado);
    }

    @Override
    public double calcularVolume() {
        // Volume do Cubo = lado * lado * lado
        return this.lado * this.lado * this.lado;
    }

    @Override
    public void imprimirArea(double area) {
        System.out.println("O valor da área do cubo é de " + area);
    }

    @Override
    public void imprimirVolume(double volume) {
        System.out.println("O valor do volume de um cubo é: " + volume);
    }
}
