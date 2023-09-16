package com.pacoprojects.entrada.dados.joptionpane;

import javax.swing.JOptionPane;

public class EntradaDadosJOptionPaneMessageDialog {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int resultado = (int) (carroNumero / pessoaNumero); /* 4 carros */

		int resto = (int) (carroNumero % pessoaNumero);

		JOptionPane.showMessageDialog(null,
				"Divisao de carro por pessoas: " + resultado + " e sobrou " + resto + " carros");

	}
}
