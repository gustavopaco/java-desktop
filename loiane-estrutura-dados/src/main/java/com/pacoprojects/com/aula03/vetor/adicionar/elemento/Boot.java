package main.java.com.pacoprojects.com.aula03.vetor.adicionar.elemento;

import main.java.com.pacoprojects.com.aula03.vetor.adicionar.elemento.model.Vetor;

public class Boot {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(1);

        vetor.adicionarElemento("JAVA");
        vetor.adicionarElemento("JAVASCRIPT");
        System.out.println("Adicionado");
    }
}
