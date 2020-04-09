package com.sgpembalagens.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgpembalagens.domain.Cidade;
import com.sgpembalagens.repository.CidadeDao;
import com.sgpembalagens.service.CidadeService;
import com.sgpembalagens.utils.IterableUtils;

@Service
@Transactional
public class CidadeServiceImpl implements CidadeService{

	@Autowired
	private CidadeDao dao;
	
	@Override
	public void salvar(Cidade cidade) {
		dao.save(cidade);		
	}

	@Override
	public void deletar(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Cidade buscarPorId(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cidade> buscarTodos() {
		return IterableUtils.toList(dao.findAll());
	}

}
