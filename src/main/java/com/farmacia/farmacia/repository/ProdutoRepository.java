package com.farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.farmacia.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>
{
	List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
