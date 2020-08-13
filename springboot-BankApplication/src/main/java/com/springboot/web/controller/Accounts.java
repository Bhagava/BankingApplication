package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.PrimaryAccount;
import com.springboot.web.model.SavingsAccount;
import com.springboot.web.service.AccountService;

@RestController
public class Accounts {
	
	@Autowired
	AccountService accountService;
	
	
	@RequestMapping("/primary")
	public PrimaryAccount addPrimaryAccount()
	{
		PrimaryAccount Obj;
		Obj=accountService.createPrimaryAccount();
		return Obj;
	}
	
	@RequestMapping("/savings")
	public SavingsAccount addSavingsAccount()
	{
		SavingsAccount Obj;
		Obj=accountService.createSavingsAccount();
		return Obj;
	}
	
}
