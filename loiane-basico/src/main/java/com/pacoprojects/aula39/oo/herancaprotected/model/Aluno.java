package com.pacoprojects.aula39.oo.herancaprotected.model;

public class Aluno extends PessoaFisica {
    private String[] cursos;
    private double[][] notas;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String[] cursos, double[][] notas) {
        super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    private double calcularMedia() {
        double somaNotas = 0;
        for (int i = 0; i < this.notas.length; i++) {

        }

        return somaNotas / 4;
    }

    public boolean verificarAprovado() {
        return true;
    }
}
