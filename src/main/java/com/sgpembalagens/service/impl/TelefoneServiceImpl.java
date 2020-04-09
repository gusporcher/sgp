package com.sgpembalagens.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgpembalagens.domain.Telefone;
import com.sgpembalagens.repository.TelefoneDao;
import com.sgpembalagens.service.TelefoneService;
import com.sgpembalagens.utils.IterableUtils;

@Service
@Transactional
public class TelefoneServiceImpl implements TelefoneService{

	@Autowired
	private TelefoneDao dao;
	
	@Override
	public void salvar(Telefone telefone) {
		dao.save(telefone);		
	}

	@Override
	public void deletar(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Telefone buscarPorId(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Telefone> buscarTodos() {
		return IterableUtils.toList(dao.findAll());
	}

}
