package com.sgpembalagens.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgpembalagens.domain.Endereco;
import com.sgpembalagens.repository.EnderecoDao;
import com.sgpembalagens.service.EnderecoService;
import com.sgpembalagens.utils.IterableUtils;

@Service
@Transactional
public class EnderecoServiceImpl implements EnderecoService{

	@Autowired
	private EnderecoDao dao;
	
	@Override
	public void salvar(Endereco endereco) {
		dao.save(endereco);		
	}

	@Override
	public void deletar(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Endereco buscarPorId(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Endereco> buscarTodos() {
		return IterableUtils.toList(dao.findAll());
	}

}
