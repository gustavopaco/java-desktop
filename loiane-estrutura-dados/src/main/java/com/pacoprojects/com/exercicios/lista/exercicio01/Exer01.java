package main.java.com.pacoprojects.com.exercicios.lista.exercicio01;

import main.java.com.pacoprojects.com.exercicios.lista.exercicio01.model.Lista;

public class Exer01 {
    public static void main(String[] args) {

        Lista<String> array = new Lista<String>(10);

        array.adicionarElemento("A");
        array.adicionarElemento("B");
        array.adicionarElemento("C");

        boolean existe = array.contem("B");
        if (existe) {
            System.out.println("Elemento existe.");
        } else {
            System.out.println("Elemento não existe.");
        }
    }
}
