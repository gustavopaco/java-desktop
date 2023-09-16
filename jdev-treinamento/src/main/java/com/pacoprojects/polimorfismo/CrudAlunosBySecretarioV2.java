package com.pacoprojects.polimorfismo;

import com.pacoprojects.estrutura.dados.arraylist.CrudAlunosArrayList;
import com.pacoprojects.constantes.StatusAluno;
import com.pacoprojects.heranca.Aluno;
import com.pacoprojects.estrutura.dados.shared.model.Disciplina;
import com.pacoprojects.heranca.Secretario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CrudAlunosBySecretarioV2 {

	public static void main(String[] args) {
		
		boolean validaUser = false;
		
		while(validaUser == false) {
			String login = (JOptionPane.showInputDialog("Informe o login: "));
			String senha = (JOptionPane.showInputDialog("Informe a senha: "));

			/* Exemplo de polimorfismo, onde a classe Secretario utiliza o metodo autenticar que esta na interface PermitirAcesso */
			if (new Secretario(login,senha).autenticar()) { /* VOU TRAVAR O CONTRATO PARA AUTORIZAR SOMENTE QUEM REALMENTE TEM O CONTRATO LEGITIMO*/
				validaUser = true;
				List<Aluno> listaAluno = new ArrayList<Aluno>();

				/*
				 * EH UMA LISTA QUE DENTRO DELA TEMOS UMA CHAVE QUE IDENTIFICA UMA SEQUENCIA DE
				 * VALORES TAMBEM
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 0; qtd <= 2; qtd++) {

					Aluno aluno = new Aluno();

					aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno. " + (qtd+1)));

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
						CrudAlunosArrayList.deletarDisciplina(aluno);
					}

					listaAluno.add(aluno);
				}

				/* INSTANCIANDO AS CHAVES */
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				/* SEPARANDO LISTAS DE ALUNOS APROVADOS, RECUPERACAO, REPROVADOS */
				for (Aluno aluno : listaAluno) {

					if (aluno.getAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("---------------------Lista dos Aprovados:---------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Nome: " + aluno.getNome() + "  Status: " + aluno.getAprovado()
							+ " E com media de: " + aluno.getMediaNota());
					
				}
				System.out.println("---------------------Lista dos Recuperacao:---------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Nome: " + aluno.getNome() + "  Status: " + aluno.getAprovado()
							+ " E com media de: " + aluno.getMediaNota());
				}
				System.out.println("---------------------Lista dos Reprovados:---------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Nome: " + aluno.getNome() + "  Status: " + aluno.getAprovado()
							+ " E com media de: " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
			}
		}
	}
}
