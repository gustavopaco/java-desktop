package com.pacoprojects.aula38.oo.herancasuper.model;

public class Professor extends PessoaFisica {
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor() {
    }

    public Professor(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    public Professor(String nome, String endereco, String telefone, String cpf, String departamento, String nomeCurso, double salario) {
        super(nome, endereco, telefone, cpf);
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
}
