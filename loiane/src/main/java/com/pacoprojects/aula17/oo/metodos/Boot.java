package com.pacoprojects.aula17.oo.metodos;

import com.pacoprojects.aula17.oo.metodos.model.Carro;

public class Boot {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numeroPassageiros = 4;
        fusca.capacidadeCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

        van.exibirAutonomia();
        fusca.exibirAutonomia();
    }
}
