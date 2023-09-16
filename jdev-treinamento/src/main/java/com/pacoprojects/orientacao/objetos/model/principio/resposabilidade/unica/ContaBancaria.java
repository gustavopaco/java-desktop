package com.pacoprojects.orientacao.objetos.model.principio.resposabilidade.unica;

public class ContaBancaria {

	private String descricao;
	private double saldo = 8000;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar100() {
		saldo -= 100;
	}
	
	public void depositar100() {
		 saldo += 100;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Metodo sacar pertence a classe ContaBancaria, e nao a classe Cliente
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
}
