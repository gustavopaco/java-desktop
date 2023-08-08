package main.java.com.pacoprojects.com.exercicios.fila.exercicio01;

import main.java.com.pacoprojects.com.exercicios.fila.exercicio01.model.Documento;
import main.java.com.pacoprojects.com.exercicios.fila.exercicio01.model.ThreadImpressao;

import java.util.LinkedList;
import java.util.Queue;

public class Exer01 {
    public static void main(String[] args) {

        Queue<Documento> filaDocumentos = new LinkedList<>();

        filaDocumentos.add(new Documento("Projeto Spring", 5));
        filaDocumentos.add(new Documento("Projeto JSF", 6));
        filaDocumentos.add(new Documento("Projeto Angular", 10));

        System.out.println(filaDocumentos);
        System.out.println();

        ThreadImpressao threadImpressao = new ThreadImpressao(filaDocumentos);
    }
}
