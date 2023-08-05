package main.java.com.pacoprojects.com.exercicios.lista.exercicio06;

import main.java.com.pacoprojects.com.exercicios.lista.exercicio06.model.Contato;
import main.java.com.pacoprojects.com.exercicios.lista.exercicio06.model.Lista;

public class Exer06 {
    public static void main(String[] args) {

        Lista<Contato> arrayContatos = new Lista<>(20);

        for (int i = 0; i < 30; i++) {
            Contato contato = new Contato(("Contato " + i), ("123456" + i), ("contato" + i + "@gmail.com"));
            arrayContatos.adicionarElemento(contato);
        }

        System.out.println("Tamanho da lista de contatos: " + arrayContatos.tamanho());
        System.out.println();

        System.out.println("toString => " + arrayContatos);
        System.out.println();

        System.out.println("Buscar contato da posicao 5 => " + arrayContatos.buscarElementoPosicao(5));
        System.out.println();

        System.out.println("Buscar posicao contato com nome, Contato 10...");
        int posicao = arrayContatos.existe(new Contato("Contato 10", "12345610", "contato10@gmail.com"));
        if (posicao > -1) {
            System.out.println("Contato 10 existe na posicao " + posicao + " do vetor");
        } else {
            System.out.println("Contato 10 não existe.");
        }
        System.out.println();

        System.out.println("Inserir Contato 50 na posicao 10...");
        arrayContatos.inserirElementoPosicao(new Contato("Contato 50", "12345650","contato50@gmail.com"),10);
        System.out.println("Buscar contato da posicao 10 => " + arrayContatos.buscarElementoPosicao(10));
        System.out.println("Número de contatos no vetor: " + arrayContatos.tamanho());
        System.out.println();

        System.out.println("Remover contato da posicao 10...");
        arrayContatos.removerElemento(10);
        System.out.println("Buscar contato da posicao 10 => " + arrayContatos.buscarElementoPosicao(10));
        System.out.println("Número de contatos no vetor: " + arrayContatos.tamanho());
        System.out.println();

        System.out.println("Buscar Contato 50 no vetor...");
        boolean contem = arrayContatos.contem(new Contato("Contato 50", "12345650", "contato50@gmail.com"));
        if (contem) {
            System.out.println("Contato 50 ainda está no vetor");
        } else {
            System.out.println("Contato 50 não se encontra mais no vetor");
        }
        System.out.println();

        System.out.println("Adicionando um novo Contato 10 no fim do vetor...");
        arrayContatos.adicionar(new Contato("Contato 10", "12345610", "contato10@gmail.com"));
        System.out.println("Tamanho do vetor: " + arrayContatos.tamanho());
        System.out.println("Posição da última vez que encontramos o Contato 10 no vetor...");
        System.out.println("Posição: " + arrayContatos.ultimoIndice(new Contato("Contato 10", "12345610", "contato10@gmail.com")));
        System.out.println();

        System.out.println("Removendo primeiro Contato 10 existente no vetor...");
        arrayContatos.remove(new Contato("Contato 10", "12345610", "contato10@gmail.com"));
        System.out.println("Tamanho do vetor: " + arrayContatos.tamanho());
        System.out.println("Buscar contato da posicao 10 => " + arrayContatos.buscarElementoPosicao(10));
        System.out.println();

        System.out.println("Obter Contato da posicao 29 do vetor");
        System.out.println("toString => " + arrayContatos.obtem(29));
        System.out.println();

        System.out.println("Limpar vetor...");
        arrayContatos.limpar();
        System.out.println("Tamanho do vetor: " + arrayContatos.tamanho());
        System.out.println("toString => " + arrayContatos);
    }
}
