package com.sgpembalagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgpembalagens.domain.Telefone;

public interface TelefoneDao extends JpaRepository<Telefone, Long> {

}
