package com.pacoprojects.orientacao.objetos;

import com.pacoprojects.orientacao.objetos.model.principio.resposabilidade.unica.ContaBancaria;

public class BootContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setDescricao("Conta Bancaria do Gustavo");
		
		
		System.out.println(conta);
	
		conta.sacar100();
		conta.sacar100();
		System.out.println(conta);
		
		conta.sacar(400);
		System.out.println(conta);
		
		conta.depositar(1000);
		System.out.println(conta);
		
		conta.depositar100();
		System.out.println(conta);
	}
}
