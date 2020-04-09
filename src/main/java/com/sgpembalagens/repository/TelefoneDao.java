package com.sgpembalagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.sgpembalagens.domain.Telefone;

public interface TelefoneDao extends CrudRepository<Telefone, Long> {

}
