package com.sgpembalagens.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgpembalagens.domain.Fornecedor;
import com.sgpembalagens.repository.FornecedorDao;
import com.sgpembalagens.service.FornecedorService;
import com.sgpembalagens.utils.IterableUtils;

@Service
@Transactional
public class FornecedorServiceImpl implements FornecedorService{

	@Autowired
	private FornecedorDao dao;
	
	@Override
	public void salvar(Fornecedor fornecedor) {
		dao.save(fornecedor);		
	}

	@Override
	public void deletar(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Fornecedor buscarPorId(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Fornecedor> buscarTodos() {
		return IterableUtils.toList(dao.findAll());
	}

}
