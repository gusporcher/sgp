package com.sgpembalagens.domain;

public enum ContatoType {
	PRINCIPAL(1, "Principal"),
	COMERCIAL(2, "Comercial"),
	FISCAL(3, "Fiscal"),
	FINANCEIRO(4, "Financeiro"),
	VENDAS(5, "Vendas"),
	COMPRAS(6, "Compras"),
	OUTRO(7, "Outro");
	
	private int tipo;
	private String descricao;
	
	private ContatoType(int tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
