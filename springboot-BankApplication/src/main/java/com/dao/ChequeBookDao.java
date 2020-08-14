package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.Chequebook;

public interface ChequeBookDao extends JpaRepository<Chequebook, Long> {
		
}
