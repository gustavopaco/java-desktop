package main.java.com.pacoprojects.aula60.escopovariaveis;

import main.java.com.pacoprojects.aula60.escopovariaveis.model.EscopoVariaveis;

public class Boot {
    public static void main(String[] args) {
        EscopoVariaveis escopoVariaveis = new EscopoVariaveis();
        escopoVariaveis.setValor(10);

        // Referencia ao atributo
        System.out.println(escopoVariaveis.getValor());
        // Referencia ao parametro
        System.out.println(escopoVariaveis.calculaValor(20));
        // Referencia ao atributo
        System.out.println(escopoVariaveis.getValor());

        System.out.println(escopoVariaveis.teste());
    }
}
