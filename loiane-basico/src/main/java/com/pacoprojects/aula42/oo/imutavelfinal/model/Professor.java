package com.pacoprojects.aula42.oo.imutavelfinal.model;

public class Professor{
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor() {
    }

    public Professor(String departamento, String nomeCurso, double salario) {
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }

    //@Override
    public String obterEtiquetaEndereco() {
        String s = "Endereco do professor: ";
        //s += super.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereco do professor...");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
