package com.sgpembalagens.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgpembalagens.domain.Representante;
import com.sgpembalagens.repository.RepresentanteDao;
import com.sgpembalagens.service.RepresentanteService;
import com.sgpembalagens.utils.IterableUtils;

@Service
@Transactional
public class RepresentanteServiceImpl implements RepresentanteService{

	@Autowired
	private RepresentanteDao dao;
	
	@Override
	public void salvar(Representante representante) {
		dao.save(representante);		
	}

	@Override
	public void deletar(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Representante buscarPorId(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Representante> buscarTodos() {
		return IterableUtils.toList(dao.findAll());
	}

}
