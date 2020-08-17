package com.icin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.model.Chequebook;
import com.icin.model.User;


@Service
public class ChequeBookService {
	
	@Autowired
	com.icin.dao.ChequeBookDao chequeBookDao;
	
	@Autowired
	com.icin.dao.MyRepo repo;

//	public Chequebook addchequebook(Chequebook chequebook, String mailid) {
//		User user = repo.findByMailid(chequebook.getUser().getId());
//		chequebook.setUser(user);
//		return chequeBookDao.save(chequebook);
//	}
	
	public Chequebook addchequebook(Chequebook chequebook)
	{
		User user =repo.findById(chequebook.getUser().getId());
		System.out.println(user.getId());
		chequebook.setUser(user);
		return chequeBookDao.save(chequebook);
	}
	
//	public Chequebook addchequebook(Chequebook chequebook, Long id)
//	{
//		User user = repo.findById(id);
//		chequebook.setUser(user);
//		return chequeBookDao.save(chequebook);
//	}
	
}
