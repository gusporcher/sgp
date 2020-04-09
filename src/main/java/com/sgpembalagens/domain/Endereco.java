package com.sgpembalagens.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Endereco extends AbstractEntity<Long> {
	@Column(nullable = false, length = 150)
	private String logradouro;
	
	@Column(nullable = false, length = 10)
	private String numero;
	
	@Column(length = 50)
	private String complemento;
	
	@Column(nullable = false, length = 50)
	private String bairro;
	
	@Column(nullable = false, length = 9)
	private String cep;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="CIDADE_ID", nullable = false)
	private Cidade cidade;
	
	@Column(nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private EnderecoType tipoEndereco;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "PARCEIRO_ID")
	private Parceiro parceiro;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public EnderecoType getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(EnderecoType tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}
	
	

}
