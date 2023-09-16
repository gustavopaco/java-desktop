package com.pacoprojects.heranca;

import com.pacoprojects.constantes.StatusAluno;
import com.pacoprojects.estrutura.dados.shared.model.Disciplina;

import java.util.ArrayList;
import java.util.List;

/* CLASSE FILHA DE PESSOA, QUE EXTENDE DE PESSOA */
public class Aluno extends Pessoa { /* NA CLASSE FILHA TODOS OS ATRIBUTOS SAO PRIVATE, NA CLASSE PAI TODOS OS ATRIBUTOS SAO PROTECTED */

//	ATRIBUTOS do Aluno
    private String dataMatricula;
    private String matricula;
    private String serieMatriculado;
    private String nomeEscola;
    private String curso;
    private List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();

    /* CONSTRUTOR - Cria os dados na memoria - Sendo padrao do Java */
    public Aluno() {
    }

    //	CONSTRUTOR ja passando o nome do aluno como padrao ao criar o Objeto
    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    //	CONSTRUTOR ja passando o nome e idade do aluno como padrao ao criar o Objeto
    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
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

    public List<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(List<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    @Override /* IDENTIFICA METODO SOBREESCRITO */
    public boolean pessoaMaiorIdade() {
        return idade >= 21;
    }

    public String msgMaiorIdade() {
        return this.pessoaMaiorIdade() ? "Aluno Maior de idade. " : "Aluno Menor de idade";
    }

    @Override
    public double salario() {
        return 1500.90;
    }

    public String getImprimeDiscNota() {
        String imprime = "";
        String imprimeFinal = "";
        for (Disciplina disciplina : listaDisciplina) {
            imprime += disciplina.getDisciplina() + "  | Nota: " + disciplina.getNota() + "\n";
        }
        imprimeFinal = "Aluno: " + nome + "\nIdade: " + idade + "\nData de Nascimento: " + dataNascimento + "\nDisciplinas: \n" + imprime
                + "\nMedia Geral: " + getMediaNota() + "\nStatus do Aluno: " + getAprovado();
        return imprimeFinal;
    }

    public double getMediaNota() {
        double media = 0.0;
        for (Disciplina disciplina : listaDisciplina) {
            media += disciplina.getMediaNota();
        }
        return media / listaDisciplina.size();
    }

    public String getAprovado() {
        if (getMediaNota() >= 50) {
            if (getMediaNota() >= 70) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }
        } else {
            return StatusAluno.REPROVADO;
        }
    }

    /* Metodo que retorna TRUE para aprovado e FALSE para reprovado */
    public boolean getAprovado2() {
        if (getMediaNota() >= 70) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno [dataMatricula=" + dataMatricula + ", matricula=" + matricula + ", serieMatriculado="
                + serieMatriculado + ", nomeEscola=" + nomeEscola + ", curso=" + curso + ", listaDisciplina="
                + listaDisciplina + ", nome=" + nome + ", Idade=" + idade + ", dataNascimento=" + dataNascimento
                + ", cpf=" + cpf + ", rg=" + rg + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
    }
}
