package main.java.com.pacoprojects.com.aula07.vetor.adicionar.elemento.qualquer.posicao;

import main.java.com.pacoprojects.com.aula07.vetor.adicionar.elemento.qualquer.posicao.model.Vetor;

public class Boot {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionarElemento("JAVA");
        vetor.adicionarElemento("JAVASCRIPT");
        vetor.adicionarElemento("CSS");
        System.out.println("Tamanho: " + vetor.tamanho());
        System.out.println("Elementos: " + vetor);
        System.out.println("Elemento Posicao 0: " + vetor.buscarElementoPosicao(0));

        try {
            System.out.println(vetor.buscarElementoPosicao(1));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("Existe: " + vetor.existe("Typescript"));
        vetor.inserirElementoPosicao("Typescript", 9);
        System.out.println("Elemento Posicao 9: " + vetor.buscarElementoPosicao(9));
        vetor.inserirElementoPosicao("HTML", 1);
        System.out.println("Elemento Posicao 0: " + vetor.buscarElementoPosicao(1));
        vetor.inserirElementoPosicao("Kotlin", 5);
        System.out.println("Elemento Posicao 0: " + vetor.buscarElementoPosicao(1));
        vetor.inserirElementoPosicao("Objective-C", 5);
    }
}
