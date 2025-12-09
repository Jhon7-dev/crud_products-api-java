package com.joao.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


// criando uma entidade simples 


@Entity
public class Produtos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String nome;
	private Integer quantidade;
	private Double preco;
	//private List<ItensPedido>itens = new ArrayList();
	public Produtos(Long id, String nome, Integer quantidade, Double preco) {
	
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		//this.itens = itens;/
	}
	public Produtos() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
// List<ItensPedido> getItens() {
	//	return itens;
//	}
	
	
	public Integer quantidadeTotal() {
		return null;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco, quantidade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco)
				&& Objects.equals(quantidade, other.quantidade);
	}
	
	
	
}
