package com.pacoprojects.exercicios.lista.aula44a46;

import com.pacoprojects.exercicios.lista.aula44a46.model.*;

public class Boot {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Piramide piramide = new Piramide();
        Cubo cubo = new Cubo();
        Circulo circulo = new Circulo();
        Cilindro cilindro = new Cilindro();

        quadrado.setNome("Quadrado");
        quadrado.setLado(5);

        triangulo.setNome("Triângulo");
        triangulo.setBase(4);
        triangulo.setAltura(6);

        piramide.setNome("Pirâmide");
        piramide.setLado(6);
        piramide.setAltura(5);
        piramide.setApotema(10);
        piramide.setBase(quadrado);

        cubo.setNome("Cubo");
        cubo.setLado(7);

        circulo.setNome("Círculo");
        circulo.setRaio(9);

        cilindro.setNome("Cilindro");
        cilindro.setRaio(10);
        cilindro.setAltura(15);

        FiguraGeometrica[] figuraGeometricas = new FiguraGeometrica[6];
        figuraGeometricas[0] = quadrado;
        figuraGeometricas[1] = triangulo;
        figuraGeometricas[2] = piramide;
        figuraGeometricas[3] = cubo;
        figuraGeometricas[4] = circulo;
        figuraGeometricas[5] = cilindro;

        for (int i = 0; i < figuraGeometricas.length; i++) {
            System.out.println();
            System.out.println(figuraGeometricas[i].getNome());
            if (figuraGeometricas[i] instanceof DimensaoSuperficial) {
                double area = ((DimensaoSuperficial) figuraGeometricas[i]).calcularArea();
                ((DimensaoSuperficial) figuraGeometricas[i]).imprimirArea(area);
            }

            if (figuraGeometricas[i] instanceof DimensaoVolumetrica) {
                double volume = ((DimensaoVolumetrica) figuraGeometricas[i]).calcularVolume();
                ((DimensaoVolumetrica) figuraGeometricas[i]).imprimirVolume(volume);
            }
            System.out.println("-----------------");
        }
    }
}
