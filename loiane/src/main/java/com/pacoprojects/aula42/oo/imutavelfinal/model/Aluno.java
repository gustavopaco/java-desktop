package com.pacoprojects.aula42.oo.imutavelfinal.model;

public class Aluno {
    private String[] cursos;
    private double[][] notas;

    public Aluno() {
    }

    public Aluno(String[] cursos, double[][] notas) {
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

    //@Override
    public String obterEtiquetaEndereco() {
        String s = "Endereco do aluno: ";
        //s += super.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereco do aluno...");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
