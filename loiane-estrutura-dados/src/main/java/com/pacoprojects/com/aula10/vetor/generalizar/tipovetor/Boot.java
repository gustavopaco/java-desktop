package main.java.com.pacoprojects.com.aula10.vetor.generalizar.tipovetor;

import main.java.com.pacoprojects.com.aula10.vetor.generalizar.tipovetor.model.Contato;
import main.java.com.pacoprojects.com.aula10.vetor.generalizar.tipovetor.model.VetorObjetos;

public class Boot {
    public static void main(String[] args) {

        VetorObjetos vetorObjetos = new VetorObjetos(10);

        vetorObjetos.adicionarElemento("A");
        vetorObjetos.adicionarElemento("B");
        vetorObjetos.adicionarElemento("C");
        vetorObjetos.adicionarElemento("D");
        vetorObjetos.adicionarElemento("E");
        vetorObjetos.adicionarElemento("F");

        System.out.println(vetorObjetos);

        vetorObjetos.removerElemento(0);

        System.out.println(vetorObjetos);

        int posicao = vetorObjetos.existe("C");
        if (posicao != -1) {
            vetorObjetos.removerElemento(posicao);
        } else {
            System.out.println("Elemento não existe.");
        }

        System.out.println(vetorObjetos);


        VetorObjetos vo = new VetorObjetos(10);

        Contato c1 = new Contato("Gustavo", "123456", "gustavopaco@gmail.com");
        Contato c2 = new Contato("Augusto", "456789", "augustopaco@gmail.com");
        Contato c3 = new Contato("Vagaba", "789123", "bobssg@gmail.com");
        Contato c4 = new Contato("Vagaba", "789123", "bobssg@gmail.com");
        vo.adicionarElemento(c1);
        vo.adicionarElemento(c2);
        vo.adicionarElemento(c3);

        System.out.println(vo);

        int contatoExiste = vo.existe(c4);
        if (contatoExiste != -1) {
            System.out.println("Contato existe");
        } else {
            System.out.println("Contato não existe.");
        }
    }
}
