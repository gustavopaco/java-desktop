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

        quadrado.setLado(5);

        triangulo.setBase(4);
        triangulo.setAltura(6);

        piramide.setLado(6);
        piramide.setLado(3);
        piramide.setAresta(10);

        cubo.setLado(7);

        circulo.setRaio(9);

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
            if (figuraGeometricas[i] instanceof DimensaoSuperficial) {
                ((DimensaoSuperficial) figuraGeometricas[i]).calcularArea();
            }

            if (figuraGeometricas[i] instanceof DimensaoVolumetrica) {
                ((DimensaoVolumetrica) figuraGeometricas[i]).calcularVolume();
            }
        }
    }
}
