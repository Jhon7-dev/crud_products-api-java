package com.joao.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Pedido {
	@Id
	private Long id;
	private Date dataPedido;
	
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	
	public Double total() {
		return null;
	}
}
