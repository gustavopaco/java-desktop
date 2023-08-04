package main.java.com.pacoprojects.com.aula05.vetor.obter.elemento.posicao;

import main.java.com.pacoprojects.com.aula05.vetor.obter.elemento.posicao.model.Vetor;

public class Boot {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionarElemento("JAVA");
        vetor.adicionarElemento("JAVASCRIPT");
        System.out.println("Tamanho: " + vetor.tamanho());
        System.out.println("Elementos: " + vetor);
        System.out.println("Elemento Posicao 0: " + vetor.buscarElementoPosicao(0));

        try {
            System.out.println(vetor.buscarElementoPosicao(50));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
