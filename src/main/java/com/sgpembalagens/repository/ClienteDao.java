package com.sgpembalagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.sgpembalagens.domain.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
