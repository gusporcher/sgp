package com.sgpembalagens.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgpembalagens.domain.Cliente;
import com.sgpembalagens.repository.ClienteDao;
import com.sgpembalagens.service.ClienteService;
import com.sgpembalagens.utils.IterableUtils;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao dao;
	
	@Override
	public void salvar(Cliente cliente) {
		dao.save(cliente);		
	}

	@Override
	public void deletar(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente buscarPorId(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> buscarTodos() {
		return IterableUtils.toList(dao.findAll());
	}

}
