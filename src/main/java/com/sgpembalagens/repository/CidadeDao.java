package com.sgpembalagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgpembalagens.domain.Cidade;

public interface CidadeDao extends JpaRepository<Cidade, Long>{

}
