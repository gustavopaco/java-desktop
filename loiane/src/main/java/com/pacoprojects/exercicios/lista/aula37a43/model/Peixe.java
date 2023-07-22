package com.pacoprojects.exercicios.lista.aula37a43.model;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe() {
        super.setAmbiente("Mar");
        super.setCor("Cinzento");
        super.setNumeroPatas(0);
        setCaracteristicas("Barbatanas e cauda");
    }

    public Peixe(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCaracterística: " + this.getCaracteristicas();
    }
}
