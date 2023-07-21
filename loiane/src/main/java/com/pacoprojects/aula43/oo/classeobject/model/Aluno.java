package com.pacoprojects.aula43.oo.classeobject.model;

import java.util.Arrays;

public class Aluno {
    private String[] cursos;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String[] cursos, double[] notas) {
        this.cursos = cursos;
        this.notas = notas;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
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

    @Override
    public String toString() {
        return "Aluno{" +
                "cursos=" + Arrays.toString(cursos) +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(cursos, aluno.cursos)) return false;
        return Arrays.equals(notas, aluno.notas);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(cursos);
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }
}
