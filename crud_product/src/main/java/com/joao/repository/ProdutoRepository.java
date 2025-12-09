package com.joao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joao.entities.Produtos;
// para encontrar um PRODUTO com base em seu nome é so jogar essa notação"Repository"
// O repositório do Spring Data irá gerar automaticamente a implementação com base no nome que fornecemos.
@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
	Produtos findByName(String nome);

}
