package com.sgpembalagens.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Representante extends Parceiro{
	
	@Column(nullable = false)
	private Double comissao;

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	
}
