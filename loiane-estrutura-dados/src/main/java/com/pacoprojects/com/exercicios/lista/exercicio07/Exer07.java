package main.java.com.pacoprojects.com.exercicios.lista.exercicio07;

import main.java.com.pacoprojects.com.exercicios.lista.exercicio07.model.Contato;
import main.java.com.pacoprojects.com.exercicios.lista.exercicio07.model.Lista;

import java.util.ArrayList;

public class Exer07 {
    public static void main(String[] args) {

        ArrayList<Contato> contatos = new ArrayList<>();
        Lista<Contato> arrayContatos = new Lista<>(10);

        for (int i = 0; i < 30; i++) {
            Contato contato = new Contato(("Contato " + i), ("123456" + i), ("contato" + i + "@gmail.com"));
            arrayContatos.adicionarElemento(contato);
        }

        for (int i = 0; i < arrayContatos.tamanho(); i++) {
            contatos.add(arrayContatos.obtem(i));
        }

        System.out.println("Tamanho da lista de contatos: " + contatos.size());
        System.out.println();

        System.out.println("toString => " + contatos);
        System.out.println();

        System.out.println("Buscar posicao contato com nome, Contato 10...");
        int posicao = contatos.indexOf(new Contato("Contato 10", "12345610", "contato10@gmail.com"));
        if (posicao > -1) {
            System.out.println("Contato 10 existe na posicao " + posicao + " do vetor");
        } else {
            System.out.println("Contato 10 não existe.");
        }
        System.out.println();

        System.out.println("Inserir Contato 50 na posicao 10...");
        contatos.add(10, new Contato("Contato 50", "12345650","contato50@gmail.com"));
        System.out.println("Buscar contato da posicao 10 => " + contatos.get(10));
        System.out.println("Número de contatos no vetor: " + contatos.size());
        System.out.println();

        System.out.println("Remover contato da posicao 10...");
        contatos.remove(10);
        System.out.println("Buscar contato da posicao 10 => " + contatos.get(10));
        System.out.println("Número de contatos no vetor: " + contatos.size());
        System.out.println();

        System.out.println("Buscar Contato 50 no vetor...");
        boolean contem = contatos.contains(new Contato("Contato 50", "12345650", "contato50@gmail.com"));
        if (contem) {
            System.out.println("Contato 50 ainda está no vetor");
        } else {
            System.out.println("Contato 50 não se encontra mais no vetor");
        }
        System.out.println();

        System.out.println("Adicionando um novo Contato 10 no fim do vetor...");
        contatos.add(new Contato("Contato 10", "12345610", "contato10@gmail.com"));
        System.out.println("Tamanho do vetor: " + contatos.size());
        System.out.println("Posição da última vez que encontramos o Contato 10 no vetor...");
        System.out.println("Posição: " + contatos.lastIndexOf(new Contato("Contato 10", "12345610", "contato10@gmail.com")));
        System.out.println();

        System.out.println("Removendo primeiro Contato 10 existente no vetor...");
        contatos.remove(new Contato("Contato 10", "12345610", "contato10@gmail.com"));
        System.out.println("Tamanho do vetor: " + contatos.size());
        System.out.println("Buscar contato da posicao 10 => " + contatos.get(10));
        System.out.println();

        System.out.println("Obter Contato da posicao 29 do vetor");
        System.out.println("toString => " + contatos.get(29));
        System.out.println();

        System.out.println("Limpar vetor...");
        contatos.clear();
        System.out.println("Tamanho do vetor: " + contatos.size());
        System.out.println("toString => " + contatos);
    }
}
