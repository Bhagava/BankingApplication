package com.springboot.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class PrimaryAccount {
	@Id
	@GeneratedValue
	
	@Column(name = "primary_id")
	private int id;
	private Long accountNumber;
	private Double accountbalance;
	
	public PrimaryAccount(Long accountNumber, Double accountbalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountbalance = accountbalance;
	}
	public PrimaryAccount() {
	}
	
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(Double accountbalance) {
		this.accountbalance = accountbalance;
	}
	
	@Override
	public String toString() {
		return "PrimaryAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountbalance=" + accountbalance
				+ "]";
	}
	
	
	
}
