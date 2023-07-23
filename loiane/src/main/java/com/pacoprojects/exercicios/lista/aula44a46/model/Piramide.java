package com.pacoprojects.exercicios.lista.aula44a46.model;

public class Piramide extends Figura3D {

    private int lado;
    private int altura;
    private int numeroPoligonos;
    private int apotema;
    private Figura2D base;

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

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public int getNumeroPoligonos() {
        return numeroPoligonos;
    }

    public void setNumeroPoligonos(int numeroPoligonos) {
        this.numeroPoligonos = numeroPoligonos;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        // Área Total da Pirâmide = Área da Base + Área das Faces Laterais

//        int areaBase = this.lado * this.lado;
        // Área das Faces Laterais = (perímetro da base * altura da pirâmide) / 2
        // perímetro da base = 4 * lado(base);
//        int perimetroBase = 4 * this.lado;
//        int areaFacetasLaterais = (perimetroBase * this.altura) / 2;
        double areaBase = 0;
        if (this.base != null) {
            // Área da Base Pirâmide Quadrada = lado * lado
            // Área da Base Pirâmide Triangular = (base * altura) / 2
            areaBase = this.base.calcularArea();

            if (this.base instanceof Quadrado) {
                setNumeroPoligonos(4);
            } else {
                setNumeroPoligonos(3);
            }

            // Área das Faces Laterais = (número de poligonos(lados)  * (comprimento do lado * comprimento apótema)) / 2
            double areaFacetasLaterais = this.numeroPoligonos * ((double) (this.lado * this.apotema) / 2);
            return areaBase + areaFacetasLaterais;
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        // Volume da Pirâmide = (Área da Base * Altura) / 3
        // Área da Base Pirâmide Quadrada = lado * lado
//        double areaBase = this.lado * this.lado;
        if (this.base != null) {
            double areaBase = this.base.calcularArea();
            return (areaBase * this.altura) / 3;
        }
        return 0;
    }

    @Override
    public void imprimirArea(double area) {
        System.out.println("O valor da área da pirâmide é de: " + area);
    }

    @Override
    public void imprimirVolume(double volume) {
        System.out.println("O valor do volume da pirâmide é de: " + String.format("%.2f", volume));
    }
}
