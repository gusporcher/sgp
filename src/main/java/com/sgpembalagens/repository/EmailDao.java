package com.sgpembalagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.sgpembalagens.domain.Email;

public interface EmailDao extends CrudRepository<Email, Long> {

}
