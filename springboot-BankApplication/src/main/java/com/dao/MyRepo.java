package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.User;

@Repository
public interface MyRepo extends JpaRepository<User, Integer>{
	User findById(Long id);
	User findByMailid(String mailid);
	User findByPhonenumber(Long phonenumber);
	User deleteById(Long id);
//	User findByMailid(String mailid);
	User findByMailidAndPassword(String mailid, String password);
}
