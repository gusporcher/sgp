package com.sgpembalagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgpembalagens.domain.Email;

public interface EmailDao extends JpaRepository<Email, Long> {

}
