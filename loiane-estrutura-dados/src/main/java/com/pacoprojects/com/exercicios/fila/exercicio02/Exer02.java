package main.java.com.pacoprojects.com.exercicios.fila.exercicio02;

import main.java.com.pacoprojects.com.exercicios.fila.exercicio02.model.GeradorSenha;
import main.java.com.pacoprojects.com.exercicios.fila.exercicio02.model.Pessoa;
import main.java.com.pacoprojects.com.exercicios.fila.exercicio02.model.TipoSenha;

import java.util.LinkedList;
import java.util.Queue;

public class Exer02 {
    public static void main(String[] args) {

        Queue<Pessoa> filaNormal = new LinkedList<>();
        Queue<Pessoa> filaPrioritaria = new LinkedList<>();
        GeradorSenha geradorSenha = new GeradorSenha();

        filaNormal.add(new Pessoa("Pessoa 1", TipoSenha.NORMAL, GeradorSenha.gerarSenha()));
        filaNormal.add(new Pessoa("Pessoa 2", TipoSenha.NORMAL, GeradorSenha.gerarSenha()));
        filaPrioritaria.add(new Pessoa("Pessoa 3", TipoSenha.PRIORITARIA, GeradorSenha.gerarSenha()));
        filaPrioritaria.add(new Pessoa("Pessoa 4", TipoSenha.PRIORITARIA, GeradorSenha.gerarSenha()));
        filaNormal.add(new Pessoa("Pessoa 5", TipoSenha.NORMAL, GeradorSenha.gerarSenha()));
        filaNormal.add(new Pessoa("Pessoa 6", TipoSenha.NORMAL, GeradorSenha.gerarSenha()));
        filaPrioritaria.add(new Pessoa("Pessoa 7", TipoSenha.PRIORITARIA, GeradorSenha.gerarSenha()));
        filaPrioritaria.add(new Pessoa("Pessoa 8", TipoSenha.PRIORITARIA, GeradorSenha.gerarSenha()));
        realizarAtendimento(filaNormal, filaPrioritaria);
    }

    private static void realizarAtendimento(Queue<Pessoa> filaNormal, Queue<Pessoa> filaPrioritaria) {

        final int MAX_PRIORIDADE = 3;
        int contador = 0;
        while (!filaNormal.isEmpty() || !filaPrioritaria.isEmpty()) {
            System.out.println();
            System.out.println("Fila Normal: " + filaNormal);
            System.out.println("Fila Prioritaria: " + filaPrioritaria);
            System.out.println();
            while (!filaPrioritaria.isEmpty() && contador < MAX_PRIORIDADE) {
                atenderPessoa(filaPrioritaria);
                contador++;
            }

            if (!filaNormal.isEmpty()) {
                atenderPessoa(filaNormal);
                contador = 0;
            }

            if (filaPrioritaria.isEmpty()) {
                while (!filaNormal.isEmpty()) {
                    atenderPessoa(filaNormal);
                }
            }
        }
    }

    private static void atenderPessoa(Queue<Pessoa> fila) {
        System.out.println("Atendendo => " + fila.peek());
        fila.remove();
    }
}
