package com.springboot.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;


@Entity
public class Chequebook {

	@Id
	@GeneratedValue
	@Column(name = "cid", nullable = false, updatable = false)
	private Long id;
	private String description;
	private String request = "false";
	
//	@ManyToOne
//	@JoinColumn(name = "userid", insertable = false, updatable = false)
	
	
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "cid", nullable = false, insertable = false, updatable = false)
	private User user;

	public Chequebook()
	{
		
	}
	
	public Chequebook(Long id, String description, User user) {
		this.id = id;
		this.description = description;
		this.user=user;
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
	public String isRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	

	@Override
	public String toString() {
		return "Chequebook [id=" + id + ", description=" + description + ", request=" + request + "]";
	}
	
	
}
