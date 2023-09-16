package com.pacoprojects.orientacao.objetos.model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Long id;
	private String descricao;
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	private List<Produto> listaProduto = new ArrayList<Produto>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(getvalorTotalVenda());
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	
	public void addLista(Produto produto) {
		/* PODERIA FAZER VALIDACOES */
		this.listaProduto.add(produto);
	}
	
	private double getvalorTotalVenda() {
		double total = 0;
		for (Produto produto : listaProduto) {
			total += produto.getValor().doubleValue(); 
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricao=" + descricao + ", nomeCliente=" + nomeCliente + ", enderecoEntrega="
				+ enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProduto=" + listaProduto + "]";
	}
	
	
}
