package com.pacoprojects.exercicios.lista.aula37a43;

import com.pacoprojects.exercicios.lista.aula37a43.model.*;

public class BootJardimZoologico {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        System.out.println("Zoo:");
        System.out.println("-------------------");

        Animal camelo = new Camelo();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Urso();
        urso.setNome("Urso");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        animals[0] = camelo;
        animals[1] = tubarao;
        animals[2] = urso;

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
            System.out.println("-------------------");
        }
    }
}
