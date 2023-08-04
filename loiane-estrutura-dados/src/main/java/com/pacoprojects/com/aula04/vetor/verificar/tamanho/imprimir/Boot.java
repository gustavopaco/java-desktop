package main.java.com.pacoprojects.com.aula04.vetor.verificar.tamanho.imprimir;


import main.java.com.pacoprojects.com.aula04.vetor.verificar.tamanho.imprimir.model.Vetor;

public class Boot {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionarElemento("JAVA");
        vetor.adicionarElemento("JAVASCRIPT");
        System.out.println("Tamanho: " + vetor.tamanho());
        System.out.println("Elementos: " + vetor);
    }
}
