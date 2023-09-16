package com.pacoprojects.estrutura.dados.arraylist;

import com.pacoprojects.heranca.Aluno;
import com.pacoprojects.estrutura.dados.shared.model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class ExemploReplaceObjetosEmList {

	public static void main(String[] args) {
		
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		
		Aluno aluno = new Aluno();
		Aluno aluno3 = new Aluno();
		Disciplina disc = new Disciplina();
		Disciplina disc3 = new Disciplina();
		double[] notas = {95,86,93,94};
		
		aluno.setNome("Jose");
		disc.setDisciplina("Portugues");
		disc.setNota(notas);
		aluno.getListaDisciplina().add(disc);
		listaAluno.add(aluno);
		
		aluno3.setNome("Maria");
		disc3.setDisciplina("Matematica");
		disc3.setNota(notas);
		aluno3.getListaDisciplina().add(disc3);
		listaAluno.add(aluno3);
		
		if(aluno3.getNome().equalsIgnoreCase("Maria")) {
			Aluno aluno4 = new Aluno();
			aluno4.setNome("Troquei o nome");
			
			Disciplina disciplina4 = new Disciplina();
			disciplina4.setDisciplina("Fisica");
			disciplina4.setNota(notas);
			
			aluno4.getListaDisciplina().add(disciplina4);
			System.out.println(listaAluno.get(1));
//			listaAluno.add(aluno4);
			listaAluno.set(1, aluno4);
			System.out.println(listaAluno.get(1));
			
		}

		for (Aluno aluno2 : listaAluno) {
			System.out.println("Nome: " + aluno2.getNome());
			for (Disciplina disc2 : aluno2.getListaDisciplina()) {
				System.out.println("Disciplina: " + disc2.getDisciplina() + "  Nota: " + disc2.getNota() + "\n");
			}
		}
	}
}
