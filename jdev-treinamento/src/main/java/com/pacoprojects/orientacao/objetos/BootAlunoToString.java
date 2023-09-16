package com.pacoprojects.orientacao.objetos;

import com.pacoprojects.orientacao.objetos.model.Aluno;
import com.pacoprojects.orientacao.objetos.model.Disciplina;

import javax.swing.*;

public class BootAlunoToString {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Disciplina d = new Disciplina();
		
		aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno."));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno")));
		aluno.setDataNascimento(JOptionPane.showInputDialog("Qual a data de nascimento do aluno"));
		aluno.setCpf(JOptionPane.showInputDialog("Informe o CPF."));
		aluno.setRg(JOptionPane.showInputDialog("Informe o RG."));
		aluno.setNomeMae(JOptionPane.showInputDialog("Qual o nome da Mae?"));
		aluno.setNomePai(JOptionPane.showInputDialog("Qual o nome do Pai?"));
		aluno.setDataMatricula(JOptionPane.showInputDialog("Informe a Data da matricula"));
		aluno.setMatricula(JOptionPane.showInputDialog("Informe o numero da Matricula"));
		aluno.setCurso(JOptionPane.showInputDialog("Informe o Curso"));
		aluno.setSerieMatriculado(JOptionPane.showInputDialog("Informe o periodo que esta cursando"));
		aluno.setNomeEscola(JOptionPane.showInputDialog("Informe o nome da faculdade"));
		
		aluno.getDisciplina().setDisciplina1(JOptionPane.showInputDialog("Informe o nome da Disciplina"));
		aluno.getDisciplina().setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1")));
		
		aluno.getDisciplina().setDisciplina2(JOptionPane.showInputDialog("Informe o nome da Disciplina"));
		aluno.getDisciplina().setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2")));
		
		aluno.getDisciplina().setDisciplina3(JOptionPane.showInputDialog("Informe o nome da Disciplina"));
		aluno.getDisciplina().setNota3(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3")));
		
		aluno.getDisciplina().setDisciplina4(JOptionPane.showInputDialog("Informe o nome da Disciplina"));
		aluno.getDisciplina().setNota4((Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4"))));
		
//		JOptionPane.showMessageDialog(null, "Nome do Aluno: " + aluno.getNome()
//		+ "\nIdade: " + aluno.getIdade()
//		+ "\nData de Nascimento: " + aluno.getDataNascimento()	
//		+ "\nCPF: " + aluno.getCpf() + "\nRG: " + aluno.getRg()
//		+ "\nNome da Mae: " + aluno.getNomeMae()
//		+ "\nNome do Pai: " + aluno.getNomePai()
//		+ "\nData da Matricula: " + aluno.getDataMatricula()
//		+ "\nNumero da Matricula: " + aluno.getMatricula()
//		+ "\nNome do Curso: " + aluno.getCurso()
//		+ "\nAluno esta cursando o: " + aluno.getSerieMatriculado() + " periodo"
//		+ "\nNome da Faculdade: " + aluno.getNomeEscola()
//		+ "\nDisciplina: " + aluno.getDisciplina().getDisciplina1() + "   Nota: " + aluno.getDisciplina().getNota1()
//		+ "\nDisciplina: " + aluno.getDisciplina().getDisciplina2() + "   Nota: " + aluno.getDisciplina().getNota2()
//		+ "\nDisciplina: " + aluno.getDisciplina().getDisciplina3() + "   Nota: " + aluno.getDisciplina().getNota3()
//		+ "\nDisciplina: " + aluno.getDisciplina().getDisciplina4() + "   Nota: " + aluno.getDisciplina().getNota4()
//		+ "\n\nMedia Geral: " + aluno.getMediaNota()
//			+ (aluno.getAprovado2() ? "\nAluno aprovado!" : "\nAluno reprovado!"));
//	JOptionPane.showMessageDialog(null, aluno.getAprovado());
		
		
		/* Descricao do objeto na memoria */ 
		System.out.println(aluno.toString());
		System.out.println("Media da nota: " + aluno.getDisciplina().getMediaNota());
		System.out.println("Resultado: " + aluno.getDisciplina().getAprovado());
		
//		JOptionPane.showMessageDialog(null, aluno.toString()
//				+ "\nMedia da nota: " + aluno.getMediaNota()
//				+ "\nResultado: " + (aluno.getAprovado2() ? "Aprovado" : "Reprovado"));
	}
}
