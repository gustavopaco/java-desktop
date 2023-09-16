package com.pacoprojects.orientacao.objetos;

import com.pacoprojects.orientacao.objetos.model.Aluno;

public class InstanciacaoObjetos {

	public static void main(String[] args) {
		
//		Objeto ainda NAO INSTANCIADO e nao existe na memoria
		Aluno aluno1;
		
//		Agora sim, aluno esta instanciado e existe na memoria
//		VARIAVEL aluno eh uma REFERENCIA para o Objeto Aluno
		Aluno aluno = new Aluno();
		
		Aluno aluno2 = new Aluno("Joao");
		
		Aluno aluno3 = new Aluno("Augusto", 28);
	}
}
