package main.java.com.pacoprojects.com.aula12.arraylist;

import java.util.ArrayList;

public class Boot {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        // Note: Adiciona elemento ao vetor
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        // Note: Adiciona um elemento em qualquer posicao do vetor
        arrayList.add(1, "B");

        System.out.println(arrayList);

        // Note: Verifica se Objeto existe no vetor, Retorna TRUE se existe e FALSE se nao existe.
        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento Existe");
        } else {
            System.out.println("Elemento não existe");
        }

        // Note: Verifica a posicao de um Objeto no vetor, Retorna o INDEX se existe e -1 se nao existe.
        int posicao = arrayList.indexOf("B");
        if (posicao > -1) {
            System.out.println("Elemento existe na posicao: " + posicao);
        } else {
            System.out.println("Elemento não existe pois posição fora do ponteiro: " + posicao);
        }

        // Note: Obtem o objeto a partir do index.
        String elemento = arrayList.get(2);
        System.out.println(elemento);

        // Note: Remove um elemento do vetor a partir de um objeto
        arrayList.remove("A");
        // Note: Remove um elemento do vator a partir do index
        arrayList.remove(0);
        System.out.println(arrayList);

        // Note: Retorna o tamanho do vetor
        int tamanho = arrayList.size();
        System.out.println(tamanho);
    }
}
