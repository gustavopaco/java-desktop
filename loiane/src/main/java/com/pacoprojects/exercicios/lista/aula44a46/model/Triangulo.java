package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Triangulo extends Figura2D {

    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // Área do Triângulo = (base * altura) / 2
        return (double) (this.base * this.altura) / 2;
    }

    @Override
    public void imprimirArea(double area) {
        System.out.println("O valor da área do triângulo é: " + String.format("%.2f", area));
    }
}
