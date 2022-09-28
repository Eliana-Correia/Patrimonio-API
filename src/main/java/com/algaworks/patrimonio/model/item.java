package com.algaworks.patrimonio.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class item {
//a primeira propriedade
	//pq os chamados são terminam em ;?
	
	@Id
	//o Generate servirá para validar
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//segunda propriedade
	//será quase um codigo de barra
	//validação NotEmpty
	@NotEmpty
	private String etiqueta;
		
	@NotEmpty
	private String descricao;
	
	private LocalDate dataAquisicao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		item other = (item) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	
	
	
}
