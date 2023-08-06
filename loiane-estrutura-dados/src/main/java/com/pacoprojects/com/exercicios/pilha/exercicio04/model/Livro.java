package main.java.com.pacoprojects.com.exercicios.pilha.exercicio04.model;

import java.time.LocalDate;

public class Livro {
    private String nome;
    private String isbn;
    private LocalDate anoLancamento;
    private String autor;

    public Livro() {
    }

    public Livro(String nome, String isbn, LocalDate anoLancamento, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", autor='" + autor + '\'' +
                '}';
    }
}
