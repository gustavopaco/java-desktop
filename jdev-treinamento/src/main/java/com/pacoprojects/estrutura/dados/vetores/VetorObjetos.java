package com.pacoprojects.estrutura.dados.vetores;

import com.pacoprojects.heranca.Aluno;
import com.pacoprojects.estrutura.dados.shared.model.Disciplina;

public class VetorObjetos {

	public static void main(String[] args) {
		
		double[] notas1 = {8.8,9.7,7.6,6.8};
		double[] notas2 = {7.1,5.7,9.6,7.8};
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Gustavo");
		aluno1.setNomeEscola("COTEMIG");
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("POO");
		disciplina1.setNota(notas1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Banco de Dados");
		disciplina2.setNota(notas2);
		
		aluno1.getListaDisciplina().add(disciplina1);
		aluno1.getListaDisciplina().add(disciplina2);

		double[] notas3 = {5.0,7.1,9.9,4.1};
		double[] notas4 = {5.9,3.1,1.5,6.3};
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Gustavo 2");
		aluno2.setNomeEscola("COTEMIG 2");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("POO 2");
		disciplina3.setNota(notas3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Banco de Dados 2");
		disciplina4.setNota(notas4);
		
		aluno2.getListaDisciplina().add(disciplina3);
		aluno2.getListaDisciplina().add(disciplina4);
		
		//---------------------------------------------------------------------
		/* Vetor de Objetos */
		Aluno[] vetorAluno = new Aluno[2];
		
		vetorAluno[0] = aluno1;
		vetorAluno[1] = aluno2;
		
		for(int i = 0 ; i < vetorAluno.length ; i++) {
			System.out.println("Nome do aluno : " + vetorAluno[i].getNome());
			System.out.println("Escola do aluno : " + vetorAluno[i].getNomeEscola());
			
			for (Disciplina disc : vetorAluno[i].getListaDisciplina()) {
				System.out.println("O nome da disciplina eh = " + disc.getDisciplina());
			
				for (int pos = 0 ; pos < disc.getNota().length ; pos++) {
					System.out.println("Nota " + pos + " eh = " + disc.getNota()[pos]);
				}
			}
			
		}
		
		
//		for(int i = 0 ; i < vetorAluno.length ; i++) {
//			System.out.println("Nome do aluno: " + vetorAluno[i].getNome());
//			System.out.println("Nome da Faculdade: " + vetorAluno[i].getNomeEscola());
//			
//			for(int pos = 0 ; pos < vetorAluno[i].getListaDisciplina().size() ; pos++) {
//				System.out.println("Nome da Disciplina do aluno eh = " + vetorAluno[i].getListaDisciplina().get(pos).getDisciplina());
//				
//				for(int k = 0 ; k < vetorAluno[i].getListaDisciplina().get(pos).getNota().length ; k++) {
//					System.out.println("Nota do Aluno eh = " + vetorAluno[i].getListaDisciplina().get(pos).getNota()[k]);
//				}
//			}
//		}
		
		
	}
}
