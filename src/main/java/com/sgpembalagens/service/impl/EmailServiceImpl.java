package com.sgpembalagens.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgpembalagens.domain.Email;
import com.sgpembalagens.repository.EmailDao;
import com.sgpembalagens.service.EmailService;
import com.sgpembalagens.utils.IterableUtils;

@Service
@Transactional
public class EmailServiceImpl implements EmailService{

	@Autowired
	private EmailDao dao;
	
	@Override
	public void salvar(Email email) {
		dao.save(email);		
	}

	@Override
	public void deletar(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Email buscarPorId(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Email> buscarTodos() {
		return IterableUtils.toList(dao.findAll());
	}

}
