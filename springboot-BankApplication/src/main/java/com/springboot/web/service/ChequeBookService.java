package com.springboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ChequeBookDao;
import com.springboot.web.model.Chequebook;

@Service
public class ChequeBookService {
	
	@Autowired
	ChequeBookDao chequeBookDao;
	
	public Chequebook addchequebook(Chequebook chequebook)
	{
		return chequeBookDao.save(chequebook);
	}
	
}
