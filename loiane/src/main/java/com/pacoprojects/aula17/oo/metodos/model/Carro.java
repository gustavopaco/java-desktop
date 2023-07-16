package com.pacoprojects.aula17.oo.metodos.model;

public class Carro {
    public String marca;
    public String modelo;
    public int numeroPassageiros;
    public double capacidadeCombustivel;
    public double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia do veículo " + modelo + " é " + (consumoCombustivel * capacidadeCombustivel) + " km por litro.");
    }

    public double obterAutonomia() {
        System.out.println("Método obter autonomia foi chamado!");
        return consumoCombustivel * capacidadeCombustivel;
    }
}
