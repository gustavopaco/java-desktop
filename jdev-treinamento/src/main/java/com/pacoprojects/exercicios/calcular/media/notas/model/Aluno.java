package com.pacoprojects.exercicios.calcular.media.notas.model;

public class Aluno {

//	ATRIBUTOS do Aluno
	private String nome;
	private int Idade;
	private String dataNascimento;
	private String cpf;
	private String rg;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String matricula;
	private String curso;
	private String serieMatriculado;
	private String nomeEscola;

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	/* CONSTRUTOR - Cria os dados na memoria - Sendo padrao do Java */
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

//	CONSTRUTOR ja passando o nome do aluno como padrao ao criar o Objeto
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

//	CONSTRUTOR ja passando o nome e idade do aluno como padrao ao criar o Objeto
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		Idade = idadePadrao;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
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

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	public String getAprovado() {
		if (getMediaNota() >= 50) {
			if (getMediaNota() >= 70) {
				return "Aprovado!";
			} else {
				return "Em recuperacao!";
			}
		} else {
			return "Reprovado!";
		}
	}

	/* Metodo que retorna TRUE para aprovado e FALSE para reprovado */
	public boolean getAprovado2() {
		if (getMediaNota() >= 70) {
			return true;
		}else {
			return false;
		}
	}

}
