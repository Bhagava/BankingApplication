package com.springboot.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Chequebook {

	@Id
	@GeneratedValue
	@Column(name = "chequeId", nullable = false, updatable = false)
	private Long id;
	private String description;
	private boolean request;
	
	@ManyToOne
    private User user;

	public Chequebook()
	{
		
	}
	
	public Chequebook(Long id, String description, boolean request) {
		this.id = id;
		this.description = description;
		this.request = request;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isRequest() {
		return request;
	}
	public void setRequest(boolean request) {
		this.request = request;
	}
	

	@Override
	public String toString() {
		return "Chequebook [id=" + id + ", description=" + description + ", request=" + request + "]";
	}
	
	
}
