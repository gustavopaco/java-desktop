package com.pacoprojects.estrutura.dados.shared.model;

import java.util.ArrayList;
import java.util.List;

public class ClienteMercado {

	private String nome;
	private String cpf;
	private String endereco;
	private String bairro;
	private String uf;
	private String mail;
	private List<Produto> listaproduto = new ArrayList<Produto>();
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", bairro=" + bairro + ", uf=" + uf
				+ ", mail=" + mail + ", listaproduto=" + listaproduto + "]";
	}
	
	public double getTotalCompra() {
		double totalCompras = 0;
		
		for (Produto produto : listaproduto) {
			totalCompras += produto.getPreco();
		}
		return totalCompras;
	}
	
	public String getItensLista() {
		String imprimeItens = "";
		for (Produto produto : listaproduto) {
			imprimeItens += produto.getNome() + "   | Preco: " + produto.getPreco() + "\n";
		}
		
		return imprimeItens;
	}
	
	public String getDados() {
		return "Dados:" + "\nNome: " + nome + "\nCPF: " + cpf + "\nEmail: " + mail;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Produto> getListaproduto() {
		return listaproduto;
	}

	public void setListaproduto(List<Produto> listaproduto) {
		this.listaproduto = listaproduto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteMercado other = (ClienteMercado) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
}
