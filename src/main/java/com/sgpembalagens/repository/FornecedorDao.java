package com.sgpembalagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgpembalagens.domain.Fornecedor;

public interface FornecedorDao extends JpaRepository<Fornecedor, Long> {

}
