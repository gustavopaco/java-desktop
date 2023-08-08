package main.java.com.pacoprojects.com.exercicios.fila.exercicio02.model;

public class GeradorSenha {
    private static int SENHA;

    public GeradorSenha() {
    }

    public static int getSENHA() {
        return SENHA;
    }

    public static int gerarSenha() {
        SENHA++;
        return SENHA;
   }
}
