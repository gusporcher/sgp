package com.sgpembalagens.domain;

public enum EnderecoType {
	PRINCIPAL(1, "Principal"),
	ENTREGA(2, "Entrega"),
	COBRANCA(3, "Cobrança"),
	OUTRO(4, "Outro");
	
	private int tipo;
	private String descricao;
	
	private EnderecoType(int tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getTipo() {
		return tipo;
	}
}
