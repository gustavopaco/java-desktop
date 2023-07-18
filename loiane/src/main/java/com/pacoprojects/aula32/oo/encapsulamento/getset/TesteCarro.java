package com.pacoprojects.aula32.oo.encapsulamento.getset;

import com.pacoprojects.aula32.oo.encapsulamento.getset.model.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //System.out.println(carro.marca); Erro devido ao atributo ser private
        carro.setMarca("Ferrari");
        System.out.println("Marca do veículo: " + carro.getMarca());
    }
}
