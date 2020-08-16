package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.Chequebook;


@Repository
public interface ChequeBookDao extends JpaRepository<Chequebook, Long> {
		
}
