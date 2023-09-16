package com.pacoprojects.estrutura.dados.arraylist;

import com.pacoprojects.heranca.Aluno;
import com.pacoprojects.estrutura.dados.shared.model.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CrudAlunosArrayList {
	public static void main(String[] args) {
		
		List<Aluno> listaAluno = new ArrayList<Aluno>();

		for (int qtd = 0; qtd <= 1; qtd++) {

			Aluno aluno = new Aluno();

			aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno."));

			for (int i = 1; i <= 1; i++) {

				Disciplina disciplina = new Disciplina();
				double[] notas = new double[disciplina.getNota().length];

				disciplina.setDisciplina(JOptionPane.showInputDialog("Informe o Nome da Disciplina " + i));
				
				for(int pos = 0; pos < disciplina.getNota().length ; pos++) {
					notas[pos] = (Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da Disciplina " + i)));
				}

				disciplina.setNota(notas);
				/* ADICIONANDO DADOS a LISTA de DISCIPLINAS do ALUNO */
				aluno.getListaDisciplina().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja REMOVER alguma disciplina? ");

			if (escolha == 0) {
				deletarDisciplina(aluno);
			}

			listaAluno.add(aluno);
		}
		
		int escolhaCadastrarAluno = JOptionPane.showConfirmDialog(null, "Deseja CADASTRAR um novo aluno?");
		if(escolhaCadastrarAluno == 0) {
			cadastraNovoAluno(listaAluno);
		}
		
		int escolhaEditar = JOptionPane.showConfirmDialog(null, "Deseja EDITAR o NOME do Aluno?");
		
		if(escolhaEditar == 0) {
			alterarAluno(listaAluno);
		}

		int escolha2 = JOptionPane.showConfirmDialog(null, "Deseja REMOVER algum aluno?");

		if (escolha2 == 0) {
			deletarAluno(listaAluno);
		}

		imprimirAluno(listaAluno);
		
	}

	public static void deletarDisciplina(Aluno aluno) {

		int continuarRemover = 0;
		do {
			boolean checkDisciplina = false;
			String nomeD = JOptionPane.showInputDialog("Informe o nome da Disciplina que deseja REMOVER? ");

			/* PERCORRENDO LISTA de DISCIPLINAS do ALUNO */
			for (Disciplina disc : aluno.getListaDisciplina()) {

				if (nomeD.equalsIgnoreCase(disc.getDisciplina())) {

					/* REMOVENDO DISCIPLINA do ALUNO */
					checkDisciplina = true;
					aluno.getListaDisciplina().remove(disc);
					JOptionPane.showMessageDialog(null, "Disciplina DELETADA com sucesso!");
					break;
				}

			}

			if (checkDisciplina == false) {
				JOptionPane.showMessageDialog(null, "DISCIPLINA NAO econtrada.");
			}

			continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo Disciplinas?");
		} while (continuarRemover == 0 && aluno.getListaDisciplina().size() != 0);
	}

	public static void deletarAluno(List<Aluno> lista) {
		int continuarRemover = 0;
		do {
			boolean checkAluno = false;
			String nomeA = JOptionPane.showInputDialog("Informe o nome do Aluno:");

			for (Aluno aluno2 : lista) {

				if (aluno2.getNome().equalsIgnoreCase(nomeA)) {
					lista.remove(aluno2);
					JOptionPane.showMessageDialog(null, "ALUNO removido com Sucesso.");
					checkAluno = true;
					break;
				}
			}

			if (checkAluno == false) {
				JOptionPane.showMessageDialog(null, "Aluno NAO existe.");
			}

			continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo Alunos?");
		} while (continuarRemover == 0 && lista.size() != 0);
	}

	public static void alterarAluno(List<Aluno> lista) {
		int confirmAgain = 0;
		
		while (confirmAgain == 0) {
			String nomeA = JOptionPane.showInputDialog("Digite o NOME do Aluno que deseja alterar");
			boolean checkNomeAluno = false;
			/* PERCORRENDO A LISTA */
			for (int pos = 0; pos < lista.size(); pos++) {

				/* PEGAR POSICAO do OBJETO ALUNO na LISTA USANDO PONTEIRO */
				Aluno aluno = lista.get(pos);

				/* SUBSTITUINDO um ALUNO na LISTA */
				if (aluno.getNome().equalsIgnoreCase(nomeA)) {
					String novoNome = JOptionPane.showInputDialog("Informe o NOVO NOME para o Aluno");
					checkNomeAluno = true;
					aluno.setNome(novoNome);
					JOptionPane.showMessageDialog(null, "Nome Alterado com Sucesso");
				}
			}
			
			if(checkNomeAluno == false) {
				JOptionPane.showMessageDialog(null, "Aluno nao encontrado");
			}
			confirmAgain = JOptionPane.showConfirmDialog(null, "Deseja tentar EDITAR o NOME do aluno novamente?");
		}
	}

	public static void imprimirAluno(List<Aluno> lista) {

		/* VERIFICAR SE LISTA DE ALUNO ESTA VAZIA OU NULA E IMPRIME DADOS do ALUNO */
		if (lista.size() == 0 || lista == null) {
			JOptionPane.showMessageDialog(null, "Nao existe aluno na lista.");
		} else {
			/* IMPRIME ALUNOS da LISTA e SUAS DISCIPLINAS */
			for (Aluno aluno : lista) {
				String imprime = "";
				String imprimeDisc = "";
				for (Disciplina disc : aluno.getListaDisciplina()) {

					imprimeDisc += disc.getDisciplina() + "   |  Nota: " + disc.getNota() + "\n";
				}

				if (aluno.getListaDisciplina().size() == 0 || aluno.getListaDisciplina() == null) {
					imprime += "Aluno:\n" + aluno.getNome() + "\nNao Esta Matriculado em nenhuma Disciplina\n";
					JOptionPane.showMessageDialog(null, imprime);
				} else {
					imprime += "Aluno:\n" + aluno.getNome() + "\nEsta Matriculado nas Disciplinas...\n" + imprimeDisc;
					JOptionPane.showMessageDialog(null, imprime + "\nMedia Total: " + aluno.getMediaNota() + "\nResultado: " + aluno.getAprovado());
				}

			}
		}
	}

	public static void cadastraNovoAluno(List<Aluno> lista) {
		
		String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(nomeAluno);
		lista.add(aluno);
		cadastraNovaDisciplina(aluno);
	}

	public static void cadastraNovaDisciplina(Aluno aluno) {
		
		int numeroDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Informe o NUMERO de Disciplinas que deseja CADASTRAR"));
		
		for(int i = 0; i < numeroDisciplina ; i++) {
			Disciplina disc = new Disciplina();
			disc.setDisciplina(JOptionPane.showInputDialog("Informe o NOME da Disciplina"));
			double[] notas = new double[disc.getNota().length];
			
			for(int pos = 0 ; pos < disc.getNota().length; pos ++) {
				notas[pos] = (Double.parseDouble(JOptionPane.showInputDialog("Informe a NOTA da Disciplina")));
			}
			disc.setNota(notas);
			
			aluno.getListaDisciplina().add(disc);
		}
	}
}

//aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno")));
//aluno.setDataNascimento(JOptionPane.showInputDialog("Qual a data de nascimento do aluno"));

//int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de Disciplinas matriculadas"));

//for (Aluno aluno2 : listaAluno) {
//System.out.println("Alunos que sobraram na lista");
//System.out.println(aluno2.getNome());
//System.out.println("As Disciplinas sao...");
//JOptionPane.showMessageDialog(null, aluno2.getImprimeDiscNota());
//for (Disciplina disc : aluno2.getListaDisciplina()) {
//	System.out.println(disc.getDisciplina());
//}
//System.out.println("--------------------------------");
//}





//System.out.println("Aluno: ");
//System.out.println(aluno.getNome());
//System.out.println("Suas Disciplinas sao...");
//System.out.println(disc.getDisciplina() + "  | Nota: " + disc.getNota());






//System.out.println("Aluno: " + aluno.getNome());
//System.out.println("Disciplinas....");
//
///* PERCORRENDO LISTA de DISCIPLINAS do ALUNO */
//for (int posd = 0; posd < aluno.getListaDisciplina().size(); posd++) {
//
//	/* PEGAR POSICAO do OBJETO DISCIPLINA na LISTA USANDO PONTEIRO */
//	Disciplina disc = aluno.getListaDisciplina().get(posd);
//	System.out.println(disc.getDisciplina() + "  Nota: " + disc.getNota());
//}
//
//System.out.println("Media do aluno: " + aluno.getMediaNota());
//System.out.println("Resultado: " + aluno.getAprovado());
//System.out.println("-----------------------------------");
