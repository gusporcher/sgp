package com.sgpembalagens.service;

import java.util.List;

public interface GenericService<T, ID> {
	void salvar(T entity);
	void deletar(ID id);
	T buscarPorId(ID id);
	List<T> buscarTodos();
}
