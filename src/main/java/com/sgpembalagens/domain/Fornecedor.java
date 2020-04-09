package com.sgpembalagens.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Fornecedor extends Parceiro{
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(nullable = false, name = "REPRESENTANTE_ID")
	private Representante representante;
	
	public Representante getRepresentante() {
		return representante;
	}
	
	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}
}
