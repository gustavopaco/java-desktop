package main.java.com.pacoprojects.com.aula11.vetor.generalizar.configurar.tipo.generics;

import main.java.com.pacoprojects.com.aula11.vetor.generalizar.configurar.tipo.generics.model.Contato;
import main.java.com.pacoprojects.com.aula11.vetor.generalizar.configurar.tipo.generics.model.Lista;

public class Boot {
    public static void main(String[] args) {

        Lista<String> vetor = new Lista<>(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");

        System.out.println(vetor);

        Lista<Contato> contatoLista = new Lista<>(10);

        Contato c1 = new Contato("Gustavo", "123456", "gustavopaco@gmail.com");
        Contato c2 = new Contato("Augusto", "456789", "augustopaco@gmail.com");
        Contato c3 = new Contato("Vagaba", "789123", "bobssg@gmail.com");
        Contato c4 = new Contato("Vagaba", "258258", "bobssg@gmail.com");

        contatoLista.adicionarElemento(c1);
        contatoLista.adicionarElemento(c2);
        contatoLista.adicionarElemento(c3);
        contatoLista.adicionarElemento(c4);

        System.out.println(contatoLista);
    }
}
