package com.pacoprojects.entrada.dados.joptionpane;

import javax.swing.JOptionPane;

public class EntradaDadosJOptionPaneConfirmDialog {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int resultado = (int) (carroNumero / pessoaNumero); /* 4 carros */

		int resto = (int) (carroNumero % pessoaNumero);

		int resposta = JOptionPane.showConfirmDialog(null,
				"Deseja ver o resultado da divisao?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao de carro por pessoas: " + resultado);
		} else if (resposta == 1) {
			resposta = JOptionPane.showConfirmDialog(null, "Gostaria de ver o resto da divisao?");
			if (resposta == 0) {
				JOptionPane.showMessageDialog(null, "O resto da divisao eh: " + resto);
			}
		}

	}
}
