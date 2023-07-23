package com.pacoprojects.exercicios.lista.aula47a52.model;

public class ContatoNaoExisteException extends Exception {

    public ContatoNaoExisteException(String nomeConsultado) {
        super("Contato: " + nomeConsultado + " não encontrado!");
    }
}
