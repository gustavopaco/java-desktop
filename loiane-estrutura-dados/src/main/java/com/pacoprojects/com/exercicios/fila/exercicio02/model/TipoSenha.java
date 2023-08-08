package main.java.com.pacoprojects.com.exercicios.fila.exercicio02.model;

public enum TipoSenha {
    NORMAL(2),
    PRIORITARIA(1);

    private final int senha;

    TipoSenha(int senha) {
        this.senha = senha;
    }
}
