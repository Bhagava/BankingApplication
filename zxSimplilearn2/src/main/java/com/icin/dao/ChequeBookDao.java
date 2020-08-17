package com.icin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ChequeBookDao extends JpaRepository<com.icin.model.Chequebook, Long> {
		
}
