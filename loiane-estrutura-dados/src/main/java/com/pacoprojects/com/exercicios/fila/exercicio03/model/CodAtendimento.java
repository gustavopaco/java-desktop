package main.java.com.pacoprojects.com.exercicios.fila.exercicio03.model;

public enum CodAtendimento {
    VERMELHO(1), AMARELO(2), VERDE(3);

    private final int prioridade;

    CodAtendimento(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
