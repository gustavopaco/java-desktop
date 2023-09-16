package com.pacoprojects.orientacao.objetos;
import com.pacoprojects.orientacao.objetos.model.Produto;
import com.pacoprojects.orientacao.objetos.model.Venda;

import java.math.BigDecimal;

public class BootVenda {

	public static void main(String[] args) {

		Venda venda = new Venda();
		Produto produto1 = new Produto();

		produto1.setId(1L);
		produto1.setNome("Modulo Orientacao Objeto");
		produto1.setValor(BigDecimal.valueOf(100.00));

		Produto produto2 = new Produto();

		produto2.setId(2L);
		produto2.setNome("Modulo de Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300.00));
		
		Produto produto3 = new Produto();

		produto3.setId(3L);
		produto3.setNome("Modulo de Angular 8");
		produto3.setValor(BigDecimal.valueOf(250.00));
		
		Produto produto4 = new Produto();

		produto4.setId(4L);
		produto4.setNome("Modulo de Hibernate");
		produto4.setValor(BigDecimal.valueOf(300.00));

		venda.setDescricao("Venda Curso Formacao Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Gustavo Paco");

		venda.getListaProduto().add(produto1);
		venda.getListaProduto().add(produto2); /* NAO EH POSSIVEL FAZER VALIDACOES*/
		venda.addLista(produto3); /* EH POSSIVEL FAZER VALICOES*/
		venda.addLista(produto4);
		
		
//		for (Produto venda1 : venda.getListaProduto()) {
//			System.out.println("Nome do Prduto = " + venda1.getNome() + "  Valor do Produto:  R$ " + venda1.getValor());
//		}
		System.out.println("Descricao : " + venda.getDescricao() + "  Valor Total: " + venda.getValorTotal());

	}
}
