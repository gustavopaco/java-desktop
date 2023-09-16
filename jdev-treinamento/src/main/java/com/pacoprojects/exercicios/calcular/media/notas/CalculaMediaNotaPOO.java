package com.pacoprojects.exercicios.calcular.media.notas;

import com.pacoprojects.exercicios.calcular.media.notas.model.Aluno;

import javax.swing.*;

public class CalculaMediaNotaPOO {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
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
		aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1")));
		aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2")));
		aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3")));
		aluno.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4")));
		
		JOptionPane.showMessageDialog(null, "Nome do Aluno: " + aluno.getNome()
			+ "\nIdade do Aluno: " + aluno.getIdade()
			+ "\nData de Nascimento do Aluno: " + aluno.getDataNascimento()	
			+ "\nCPF: " + aluno.getCpf() + "\nRG: " + aluno.getRg()
			+ "\nNome da Mae: " + aluno.getNomeMae()
			+ "\nNome do Pai: " + aluno.getNomePai()
			+ "\nData da Matricula: " + aluno.getDataMatricula()
			+ "\nNumero da Matricula: " + aluno.getMatricula()
			+ "\nNome do Curso: " + aluno.getCurso()
			+ "\nAluno esta cursando o: " + aluno.getSerieMatriculado() + " periodo"
			+ "\nNome da Faculdade: " + aluno.getNomeEscola()
			+ "\n\nMedia: " + aluno.getMediaNota()
			+ (aluno.getAprovado2() ? "\nAluno aprovado!" : "\nAluno reprovado!"));
//		JOptionPane.showMessageDialog(null, aluno.getAprovado());
	
		
	}
}
