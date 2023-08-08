package main.java.com.pacoprojects.com.exercicios.fila.exercicio03;

import main.java.com.pacoprojects.com.exercicios.fila.exercicio03.model.*;

import java.util.Random;

public class Exer03 {
    public static void main(String[] args) {

        FilaPrioridade<Pessoa> filaPrioridade = new FilaPrioridade<>();

        for (int i = 0; i < 6; i++) {
            filaPrioridade.enfileira(new Pessoa("Pessoa " + (Consulta.novoNumeroFila()), Consulta.gerarCodigAleatorio()));
        }

        System.out.println(filaPrioridade);

        ThreadConsulta<Pessoa> pessoaThreadConsulta = new ThreadConsulta<>(filaPrioridade);

    }
}
