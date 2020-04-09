package com.sgpembalagens.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Email extends AbstractEntity<Long> {
	
	@Column(nullable = false)
	private String email;
	
	@Column(length = 150)
	private String nomeContato;
	
	@Column(nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private ContatoType tipoContato;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "PARCEIRO_ID")
	private Parceiro parceiro;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public ContatoType getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(ContatoType tipoContato) {
		this.tipoContato = tipoContato;
	}
	
	public Parceiro getParceiro() {
		return parceiro;
	}
	
	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

}
