package com.pacoprojects.aula29.oo.construtores;

import com.pacoprojects.aula29.oo.construtores.model.Carro;

public class Boot {
    public static void main(String[] args) {
        Carro van = new Carro();
        //van.numeroPassageiros = 10;

        System.out.println(van.numeroPassageiros);
    }
}
