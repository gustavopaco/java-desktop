package main.java.com.pacoprojects.aula61.passagem.parametros.referencia;

import main.java.com.pacoprojects.aula61.passagem.parametros.referencia.model.Contato;

public class Boot {
    public static void main(String[] args) {
        Contato contato = new Contato(
                "Contato 1",
                "1234-4567",
                "contato1@gmail.com");
        int valor = 10;
        Integer valorClasse = 10;

        System.out.println("******* Valores originais");

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia(valor, contato);

        System.out.println("******* Exemplo 1");
        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia2(valor, contato);

        System.out.println("******* Exemplo 2");
        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia3(valorClasse, contato);

        System.out.println("******* Exemplo 3");
        System.out.println(contato);
        System.out.println(valorClasse);
    }
    private static void testePassagemValorReferencia(int valor, Contato contato) {
        int novoValor = valor + 10;
        valor = novoValor;
        contato = new Contato(
                "Contato 2",
                "4567-7891",
                "contato2@gmail.com");
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato) {
        int novoValor = valor + 10;
        valor = novoValor;
        contato.setNome("Contato " + novoValor);
    }

    private static void testePassagemValorReferencia3(Integer valorClasse, Contato contato) {
        int novoValor = valorClasse + 50;
        valorClasse = novoValor;
        contato.setNome("Contato " + novoValor);
    }
}
