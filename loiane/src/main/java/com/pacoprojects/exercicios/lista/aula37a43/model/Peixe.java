package com.pacoprojects.exercicios.lista.aula37a43.model;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe() {
    }

    public Peixe(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        setCaracteristicas("Barbatanas e cauda");
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public int getNumeroPatas() {
        return 0;
    }

    @Override
    public String getAmbiente() {
        super.setAmbiente("Mar");
        return super.getAmbiente();
    }

    @Override
    public String getCor() {
        super.setCor("Cinzento");
        return super.getCor();
    }
}
