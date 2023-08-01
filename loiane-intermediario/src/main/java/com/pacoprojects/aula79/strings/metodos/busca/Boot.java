package main.java.com.pacoprojects.aula79.strings.metodos.busca;

public class Boot {
    public static void main(String[] args) {
        String banana = "banana";
        String ana = "ana";

        // Retorna o indice que se encontra a String ou o caractere baseado em uma String.
        // Retorna -1 caso nao seja encontrado nenhum resultado na busca
        // Note: indexOf() -> Retorna quando foi encontrado o primeiro resultado positivo de caractere ou String ou -1 se nao foi encontrado
        System.out.println(banana.indexOf("n"));
        System.out.println(banana.indexOf("x"));
        System.out.println(banana.indexOf("b"));
        System.out.println(banana.indexOf(ana));

        // Note: lastIndexOf() -> Retorna quando foi encontrado o ultimo resultado positivo de caractere ou String ou -1 se nao foi encontrado
        System.out.println(banana.lastIndexOf("a"));
        System.out.println(banana.lastIndexOf(ana));

        // Note: contains() -> Retorna true se Caractere ou String faz parte em algum ponto da String principal ou false caso nao faça parte da String
        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));
    }
}
