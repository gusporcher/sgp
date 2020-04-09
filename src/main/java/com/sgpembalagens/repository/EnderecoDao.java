package com.sgpembalagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgpembalagens.domain.Endereco;

public interface EnderecoDao extends JpaRepository<Endereco, Long> {

}
