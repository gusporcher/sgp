package com.sgpembalagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgpembalagens.domain.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Long> {

}
