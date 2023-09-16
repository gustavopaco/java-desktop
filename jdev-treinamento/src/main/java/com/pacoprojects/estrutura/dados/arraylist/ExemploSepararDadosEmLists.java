package com.pacoprojects.estrutura.dados.arraylist;

import com.pacoprojects.constantes.StatusAluno;
import com.pacoprojects.heranca.Aluno;
import com.pacoprojects.estrutura.dados.shared.model.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ExemploSepararDadosEmLists {

	public static void main(String[] args) {

		List<Aluno> listaAluno = new ArrayList<Aluno>();
		
		List<Aluno> listaAlunoAprovados = new ArrayList<Aluno>();
		List<Aluno> listaAlunoRecuperacao = new ArrayList<Aluno>();
		List<Aluno> listaAlunoReprovados = new ArrayList<Aluno>();

		for (int qtd = 0; qtd <= 5; qtd++) {

			Aluno aluno = new Aluno();

			aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno."));

			for (int i = 1; i <= 1; i++) {

				Disciplina disciplina = new Disciplina();
				double[] notas = new double[disciplina.getNota().length];

				disciplina.setDisciplina(JOptionPane.showInputDialog("Informe o Nome da Disciplina " + i));
				
				for(int pos = 0 ; pos < disciplina.getNota().length ; pos++) {
					notas[pos] = (Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da Disciplina " + i)));
				}
				disciplina.setNota(notas);

				/* ADICIONANDO DADOS a LISTA de DISCIPLINAS do ALUNO */
				aluno.getListaDisciplina().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja REMOVER alguma disciplina? ");

			if (escolha == 0) {
				CrudAlunosArrayList.deletarDisciplina(aluno);
			}

			listaAluno.add(aluno);
		}
		
		/* SEPARANDO LISTAS DE ALUNOS APROVADOS, RECUPERACAO, REPROVADOS */
		for (Aluno aluno : listaAluno) {
			
			if(aluno.getAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				listaAlunoAprovados.add(aluno);
			}else if(aluno.getAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				listaAlunoRecuperacao.add(aluno);
			}else {
				listaAlunoReprovados.add(aluno);
			}
		}
		
		System.out.println("---------------------Lista dos Aprovados:---------------------");
		for (Aluno aluno : listaAlunoAprovados) {
			System.out.println("Nome: " + aluno.getNome() 
			+ "  Status: " + aluno.getAprovado()
			+ " E com media de: " + aluno.getMediaNota());
		}
		System.out.println("---------------------Lista dos Recuperacao:---------------------");
		for (Aluno aluno : listaAlunoRecuperacao) {
			System.out.println("Nome: " + aluno.getNome() 
			+ "  Status: " + aluno.getAprovado()
			+ " E com media de: " + aluno.getMediaNota());
		}
		System.out.println("---------------------Lista dos Reprovados:---------------------");
		for (Aluno aluno : listaAlunoReprovados) {
			System.out.println("Nome: " + aluno.getNome() 
			+ "  Status: " + aluno.getAprovado()
			+ " E com media de: " + aluno.getMediaNota());
		}
	}
}
