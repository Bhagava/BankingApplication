package com.springboot.web.controller;



	
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.dao.MyRepo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot.web.model.User;

	@RestController
	public class AdminController {
		@Autowired
		MyRepo repo;
		
		@RequestMapping("/viewusers")
		@CrossOrigin(origins = "http://localhost:4200")
//		@JsonIgnore
		public List<User> viewusers(){
			return repo.findAll();
			
		}
		
		
		
//		@DeleteMapping("/lockuser/{id}")
//		@CrossOrigin(origins = "http://localhost:4200")
//	    public User lockuser(@PathVariable(value = "id") Long id)  {
//			return repo.deleteById(id);
//	    }
		
		
		
		@PutMapping("/lockuser/{id}")
		@CrossOrigin(origins = "http://localhost:4200")
	    public ResponseEntity<User> lockuser(@PathVariable(value = "id") Long id)  {
			System.out.println("1");
	        User user = repo.findById(id);
	        System.out.println("0");
	        user.setStatus("User Blocked");
	        System.out.println("12");
	        System.out.println(user.getStatus());
	        User updateduser = repo.save(user);
	        return ResponseEntity.ok(updateduser);
	    }

	}
