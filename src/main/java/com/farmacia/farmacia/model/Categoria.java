package com.farmacia.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.farmacia.farmacia.model.Util.CategoriaProdutos;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private CategoriaProdutos categoria;
	
	@NotNull
	private String produtos;
	
	@NotNull
	@Size(max = 255)
	private String descricao;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CategoriaProdutos getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProdutos categoria) {
		this.categoria = categoria;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

	

}
