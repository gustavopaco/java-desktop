package main.java.com.pacoprojects.com.exercicios.lista.exercicio02;

import main.java.com.pacoprojects.com.exercicios.lista.exercicio02.model.Lista;

public class Exer02 {
    public static void main(String[] args) {

        Lista<String> array = new Lista<String>(10);

        array.adicionarElemento("A");
        array.adicionarElemento("B");
        array.adicionarElemento("C");
        array.adicionarElemento("B");

        System.out.println(array);
        String elemento = "B";
        System.out.println("Buscando por elemento " + elemento + " ...");
        boolean existe = array.contem(elemento);
        if (existe) {
            System.out.println("Elemento " + elemento + " existe.");
        } else {
            System.out.println("Elemento não existe.");
        }
        int index = array.ultimoIndice(elemento);
        if (index > -1) {
            System.out.println("Ultimo index de B: " + index);
            elemento = array.buscarElementoPosicao(index);
            System.out.println("O elemento encontrado na posicao " + index + " foi: " + elemento);
        } else {
            System.out.println("Elemento não existe no vetor, pois retornou: " + index);
        }
    }
}
