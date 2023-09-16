package com.pacoprojects.estrutura.dados.arraylist;

import com.pacoprojects.estrutura.dados.shared.model.ClienteMercado;
import com.pacoprojects.estrutura.dados.shared.model.Produto;

import javax.swing.*;

public class ExemploMercado {

	public static void main(String[] args) {

		ClienteMercado pessoa = new ClienteMercado();

		pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
		pessoa.setCpf(JOptionPane.showInputDialog("Informe o CPF:"));
		pessoa.setMail(JOptionPane.showInputDialog("Informe o email"));

		for (int i = 0; i <= pessoa.getListaproduto().size(); i++) {

			Produto produto = new Produto();

			produto.setNome(JOptionPane.showInputDialog("Informe nome do produto:"));

			if (produto.getNome() != null && !produto.getNome().isEmpty()) {

				produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o Preco")));
				pessoa.getListaproduto().add(produto);

			} else if (pessoa.getItensLista().isEmpty()) {

				JOptionPane.showMessageDialog(null, "Lista Vazia");

			} else {

				JOptionPane.showMessageDialog(null, pessoa.getDados() +
						"\nProdutos:\n" + pessoa.getItensLista() + "\nTotal de Compras: " + pessoa.getTotalCompra());
				break;

			}
		}

	}
}
