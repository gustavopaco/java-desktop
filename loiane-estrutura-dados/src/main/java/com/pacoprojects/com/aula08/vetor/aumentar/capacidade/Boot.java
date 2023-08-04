package main.java.com.pacoprojects.com.aula08.vetor.aumentar.capacidade;

import main.java.com.pacoprojects.com.aula08.vetor.aumentar.capacidade.model.Vetor;

public class Boot {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        vetor.adicionarElemento("A");
        vetor.adicionarElemento("B");
        vetor.adicionarElemento("C");
        vetor.adicionarElemento("D");
        vetor.adicionarElemento("E");
        System.out.println(vetor);
    }
}
