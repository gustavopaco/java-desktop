package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Cilindro extends Figura3D {

    private int raio;
    private int altura;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // Área Total do Cilindro = 2 * Área da Base + Área Lateral
            // Área da Base = π * raio * raio
        double areaBase = Math.PI * this.raio * this.raio;
            // Área Lateral = perímetro da base * altura
            // Perímetro da base = 2 * π * raio
        double perimetroBase = 2 * Math.PI * this.raio;
        double areaLateral = perimetroBase * this.altura;

        return (2 * areaBase) + areaLateral;
    }

    @Override
    public double calcularVolume() {
        // Volume do Cilindro = Área da Base * Altura
            // Área da Base = π * raio * raio
        double areaBase = Math.PI * this.raio * this.raio;
        return areaBase * this.altura;
    }

    @Override
    public void imprimirArea(double area) {
        System.out.println("O valor da área do cilindro é: " + String.format("%.2f", area));
    }

    @Override
    public void imprimirVolume(double volume) {
        System.out.println("O valor do volume do cilindro é de: " + String.format("%.2f", volume));
    }
}
