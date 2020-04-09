package com.sgpembalagens.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Parceiro extends AbstractEntity<Long> {
	
	@Column(nullable = false, unique = true)
	private String razaoSocial;
	
	@Column(nullable = false)
	private String nomeFantasia;
	
	@Column(nullable = false, unique = true, length = 14)
	private String cnpj;
	
	@Column(unique = true, length = 10)
	private String inscricaoEstadual;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "parceiro")
	private List<Endereco> enderecos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "parceiro")
	private List<Email> emails;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "parceiro")
	private List<Telefone> telefones;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}
