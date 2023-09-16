package com.pacoprojects.exercicios.calcular.media.notas;

import javax.swing.JOptionPane;

public class CalculaMediaNotaJOptionPane {

	public static void main(String[] args) {

		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double mediaFinal = 0;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota do aluno: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota do aluno: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota do aluno: "));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota do aluno: "));

		int r = JOptionPane.showConfirmDialog(null, "Gostaria de ver a media do aluno?");

		/* Media para Aprovacao 70 */
		if (r == 0){
			mediaFinal = (n1 + n2 + n3 + n4) / 4;
			if(mediaFinal >= 70) {
				if(mediaFinal >= 90) {
					JOptionPane.showMessageDialog(null, "Nota: "+ mediaFinal + "\nAluno Brilhou!");
				}else {
					JOptionPane.showMessageDialog(null, "Nota: "+ mediaFinal + "\nAluno Aprovado!");	
				}
			}else if(mediaFinal >= 50) {
				JOptionPane.showMessageDialog(null, "Nota: "+ mediaFinal + "\nAluno em Recuperacao!");
			}else {
				JOptionPane.showMessageDialog(null, "Nota: "+ mediaFinal + "\nAluno Reprovado!");
			}
		}

	}
}
