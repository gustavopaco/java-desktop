package main.java.com.pacoprojects.com.aula09.vetor.remover.elemento;

import main.java.com.pacoprojects.com.aula09.vetor.remover.elemento.model.Vetor;

public class Boot {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adicionarElemento("A");
        vetor.adicionarElemento("B");
        vetor.adicionarElemento("C");
        vetor.adicionarElemento("D");
        vetor.adicionarElemento("E");
        vetor.removerElemento(0);
        System.out.println(vetor);

        int posicao = vetor.existe("A");
        if (posicao != -1) {
            vetor.removerElemento(posicao);
        } else {
            System.out.println("Elemento não existe no vetor.");
        }
        System.out.println(vetor);
    }
}
