package main.java.com.pacoprojects.com.exercicios.lista.exercicio05;

import main.java.com.pacoprojects.com.exercicios.lista.exercicio05.model.Lista;

public class Exer05 {
    public static void main(String[] args) {

        Lista<String> array = new Lista<>(10);

        array.adicionarElemento("A");
        array.adicionarElemento("B");
        array.adicionarElemento("C");
        array.adicionarElemento("D");
        array.adicionarElemento("E");

        System.out.println(array);
        array.limpar();
        System.out.println(array);
    }
}
