package com.pacoprojects.exercicios.lista.aula28a33.model;

public class Aluno {
    private String nome;
    private String cpf;
    private String matricula;
    private String curso;
    private AlunoDisciplina[] alunoDisciplinas = new AlunoDisciplina[3];

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String matricula, String curso, AlunoDisciplina[] alunoDisciplinas) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.curso = curso;
        this.alunoDisciplinas = alunoDisciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public AlunoDisciplina[] getAlunoDisciplinas() {
        return alunoDisciplinas;
    }

    public void setAlunoDisciplinas(AlunoDisciplina[] alunoDisciplinas) {
        this.alunoDisciplinas = alunoDisciplinas;
    }

    public void associarAlunoDisciplina(int posicao, AlunoDisciplina alunoDisciplina) {
        this.alunoDisciplinas[posicao] = alunoDisciplina;
    }

    public void alunoAprovado() {
        for (int i = 0; i < this.alunoDisciplinas.length; i++) {
            double somaNotas = 0;
            System.out.println("Disciplina: " + this.alunoDisciplinas[i].getDisciplina().getNome());
            somaNotas = somarNotasAluno(i, somaNotas);
            double media = calcularMediaNotas(somaNotas);
            imprimirStatusAlunoDisciplina(media);
        }
    }

    private double somarNotasAluno(int posicaoDisciplina, double somaNotas) {
        System.out.print("Notas: ");
        for (int j = 0; j < this.alunoDisciplinas[posicaoDisciplina].getNotas().length; j++) {
            somaNotas += this.alunoDisciplinas[posicaoDisciplina].getNotas()[j].getValor();
            System.out.print((this.alunoDisciplinas[posicaoDisciplina].getNotas()[j].getValor()) + " | ");
        }
        System.out.println();
        return somaNotas;
    }

    private double calcularMediaNotas(double somaNotas) {
        return somaNotas / 4;
    }

    private void imprimirStatusAlunoDisciplina(double media) {
        if (media >= 7) {
            System.out.println("A média do Aluno foi : " + media + ",  APROVADO");
        } else {
            System.out.println("A média do Aluno foi : " + media + ", REPROVADO");
        }
    }
}
