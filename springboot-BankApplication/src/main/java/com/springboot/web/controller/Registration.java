package com.springboot.web.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.Admin;
import com.springboot.web.model.User;
import com.springboot.web.service.AccountService;
import com.springboot.web.service.RegisterService;


@RestController
public class Registration {
	
	
	
	@Autowired
	RegisterService registerService;
	
	@Autowired
	AccountService accountService;
	
	
	@RequestMapping(path="/register", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerAddUser(@RequestBody User user)
	{
		User Obj;
		user.setStatus("enabled");
		Obj=registerService.saveaddUser(user);
		return Obj;
	}
	
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public User doLogin(@RequestBody User user, HttpSession  session) throws Exception
	{
		String temperorymail = user.getMailid();
		String temperorypassword = user.getPassword();
		String tempstatus = user.getStatus();
		System.out.println(tempstatus);
		User Obj = null;
		if(temperorymail != null && temperorypassword != null )
		{
			
			Obj = registerService.matchEmailPassword(temperorymail, temperorypassword);
			//session.setAttribute("mailid",temperorymail );
		}
		
		if(Obj == null)
		{
			throw new Exception("====User not exist=====");
		}
		return Obj;
	}
	
	
	@RequestMapping(path = "/admin", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public void doAdminLogin(@RequestBody Admin admin) throws Exception
	{
		String adminemail = admin.getEmailid();
		String adminpassword = admin.getPassword();
		
		if(adminemail.equals("admin") && adminpassword.equals("admin"))
		{
			System.out.println("admin successfully login");
		}
		else
		{
			throw new Exception("credentials are wrong");
		}
		
		
	}
}
