package com.pacoprojects.polimorfismo;

import com.pacoprojects.estrutura.dados.arraylist.CrudAlunosArrayList;
import com.pacoprojects.estrutura.dados.shared.auxiliares.FuncaoAutenticacao;
import com.pacoprojects.constantes.StatusAluno;
import com.pacoprojects.exception.ExcecaoProcessarNota;
import com.pacoprojects.heranca.Aluno;
import com.pacoprojects.heranca.Diretor;
import com.pacoprojects.estrutura.dados.shared.model.Disciplina;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CrudAlunosByDiretor {

	public static void main(String[] args) throws ExcecaoProcessarNota {

		try {

			lerArquivo();
			boolean validaUser = false;

			while (validaUser == false) {
				String login = (JOptionPane.showInputDialog("Informe o login: "));
				String senha = (JOptionPane.showInputDialog("Informe a senha: "));

				/* Exemplo de polimorfismo, onde o método autenticarLogin faz a autenticacao do usuário, pois a classe FuncaoAutenticacao recebe a interface PermitirAcesso como parâmetro e a classe Diretor implementa a interface PermitirAcesso */
				if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticarLogin()) {

					validaUser = true;
					List<Aluno> listaAluno = new ArrayList<Aluno>();

					/*
					 * EH UMA LISTA QUE DENTRO DELA TEMOS UMA CHAVE QUE IDENTIFICA UMA SEQUENCIA DE
					 * VALORES TAMBEM
					 */
					HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

					for (int qtd = 0; qtd <= 0; qtd++) {

						Aluno aluno = new Aluno();

						aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno. " + (qtd + 1)));
						aluno.setIdade(
								Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno? " + (qtd + 1))));
						double maiorNotaGeral = 0.0;

						for (int i = 1; i <= 2; i++) {

							Disciplina disciplina = new Disciplina();
							double[] notas = new double[disciplina.getNota().length];
							double maiorNotaDisciplina = 0.0;
							double menorNotaDisciplina = 0.0;

							disciplina.setDisciplina(JOptionPane.showInputDialog("Informe o Nome da Disciplina " + i));

							for (int pos = 0; pos < disciplina.getNota().length; pos++) {

								notas[pos] = (Double.parseDouble(
										JOptionPane.showInputDialog("Informe a nota da Disciplina " + pos)));

								if (pos == 0) {

									maiorNotaDisciplina = notas[pos];
									menorNotaDisciplina = notas[pos];

								} else {
									
									if (notas[pos] < menorNotaDisciplina) {
										menorNotaDisciplina = notas[pos];
									}
									if(notas[pos] > maiorNotaDisciplina) {
										maiorNotaDisciplina = notas[pos];
									}

								}

							}
							disciplina.setNota(notas);

							/* ADICIONANDO DISCIPLINA do ALUNO NA LISTA DE DISCIPLINAS */
							aluno.getListaDisciplina().add(disciplina);
							
							System.out.println("A maior nota da disciplina: " + disciplina.getDisciplina() + " foi: "
									+ maiorNotaDisciplina);
							System.out.println("A menor nota da disciplina: " + disciplina.getDisciplina() + " foi: "
									+ menorNotaDisciplina);

							if (maiorNotaDisciplina > maiorNotaGeral) {
								maiorNotaGeral = maiorNotaDisciplina;
							}
						}
						System.out.println("A maior nota do aluno: " + aluno.getNome() + " foi: " + maiorNotaGeral);
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
			/* Aqui */
		} catch (NumberFormatException e) { /* CAPTURA SOMENTE EXCECOES Numberformatexception */

			StringBuilder saida = new StringBuilder();

			e.printStackTrace(); /* IMPRIME ERRO NO CONSOLE JAVA */

			System.out.println("Mensagem do erro: " + e.getMessage()); /* MENSAGEM DE ERRO OU CAUSA */

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append(
						"\nClasse de erro: " + e.getStackTrace()[i].getClassName()); /* CLASSE ONDE OCORREU O ERRO */
				saida.append("\nMetodo de erro: "
						+ e.getStackTrace()[i].getMethodName()); /* NOME DO METODO QUE APRESENTOU O ERRO */
				saida.append("\nLinha de erro: "
						+ e.getStackTrace()[i].getLineNumber()); /* NUMERO DA LINHA ONDE OCORREU ERRO */
				saida.append(
						"\nNome da clase: " + e.getClass().getName()); /* NOME DO ERRO NA CLASSE nullpointerexception */
			}

			JOptionPane.showMessageDialog(null, "Erro ao converter numeros: " + saida.toString());
		} catch (NullPointerException e) { /* CAPTURA SOMENTE EXCECOES NULLpointerexception */

			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Opa um NullPointerException: " + e.getClass());
		} catch (FileNotFoundException e) { /* CAPTURA SOMENTE EXCECOES ExcecaoprocessarNota */
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da excecao customizada \n" + e.getClass().getName());
			throw new ExcecaoProcessarNota(e.getClass().getName());
		} catch (Exception e) { /* CAPTURA TODAS AS EXCECOES QUE DEREM NO SISTEMA */
			e.printStackTrace();
		} finally { /*
					 * SEMPRE EH EXECUTADO OCORRENDO ERROS OU NAO. FINALLY SEMPRE EH USADO QUANDO SE
					 * PRECISA EXECUTAR UM PROCESSO, ACONTECENDO ERRO OU NAO.
					 */
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo.");
		}
	}

	public static void lerArquivo() throws ExcecaoProcessarNota, FileNotFoundException {
		File fil = new File("F://Java/arquivo1.txt"); /* INSTANCIANDO ARQUIVO E SEU CAMINHO NA UNIDADE F */
		Scanner scanner = new Scanner(fil); /* LENDO ARQUIVO */

	}

}
