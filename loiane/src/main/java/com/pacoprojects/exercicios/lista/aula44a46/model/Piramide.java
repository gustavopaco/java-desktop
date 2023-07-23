package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Piramide extends Figura3D implements DimensaoSuperficial {

    private int lado;
    private int altura;
    private int aresta;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }

    @Override
    public void calcularArea() {
        // Área Total da Pirâmide = Área da Base + Área das Faces Laterais
            // Área da Base = lado * lado
        int areaBase = this.lado * this.lado;

            // Área das Faces Laterais = (perímetro da base * altura da pirâmide) / 2
            // perímetro da base = 4 * lado(base);
        int perimetroBase = 4 * this.lado;
        int areaFacetasLaterais = (perimetroBase * this.altura) / 2;

        int areaTotal = areaBase + areaFacetasLaterais;
        System.out.println("O valor da área da pirâmide é de: " + areaTotal);
    }
}
