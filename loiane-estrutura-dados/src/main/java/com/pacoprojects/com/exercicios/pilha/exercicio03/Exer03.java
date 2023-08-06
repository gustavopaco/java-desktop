package main.java.com.pacoprojects.com.exercicios.pilha.exercicio03;

import main.java.com.pacoprojects.com.exercicios.pilha.exercicio03.model.Livro;
import main.java.com.pacoprojects.com.exercicios.pilha.exercicio03.model.Pilha;
import main.java.com.pacoprojects.com.exercicios.pilha.util.FuncoesUteis;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha<Livro> pilhaLivros = new Pilha<>(20);

        for (int i = 0; i < 6; i++) {
            Livro livro = new Livro();
            livro.setNome(FuncoesUteis.lerValorString("Informe o nome do livro:", scanner));
            livro.setIsbn(FuncoesUteis.lerValorString("Informe o isbn do livro:", scanner));
            livro.setAutor(FuncoesUteis.lerValorString("Informe o nome do Autor do livro:", scanner));
            livro.setAnoLancamento(FuncoesUteis.lerValorData("Informe a data de lançamento do livro:", scanner));

            System.out.println("Empilhando livro => " + livro);
            pilhaLivros.empilhar(livro);
        }

        System.out.println();
        System.out.println("Verificando tamanho da pilha de Livros...");
        System.out.println("Tamanho: " + pilhaLivros.tamanho());
        System.out.println();
        System.out.println("Finalizando sistema...");
        System.out.println("Desempilhando livros...");
        while (!pilhaLivros.estaVazio()) {
            System.out.println("Desempilhando => " + pilhaLivros.topo());
            pilhaLivros.desempilhar();
        }
        System.out.println("Todos os livros foram desempilhados.");
        System.out.println("Programa finalizado");
    }
}
