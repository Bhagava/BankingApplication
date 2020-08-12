package com.springboot.web.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class User implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	private Long id;
	
	
	private String fullname;
	private String surname;
	private String mailid;
	private Long phonenumber;
	private String address;
	private String password;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int primay_id;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int savings_id;
	
	
	
	
	public User() {
	}
	
	
	public User( String fullname, String surname, String mailid, Long phonenumber, String address,
			String password) {
		super();
		this.fullname = fullname;
		this.surname = surname;
		this.mailid = mailid;
		this.phonenumber = phonenumber;
		this.address = address;
		this.password = password;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public int getPrimay_id() {
//		return primay_id;
//	}
//	public void setPrimay_id(int primay_id) {
//		this.primay_id = primay_id;
//	}
//	public int getSavings_id() {
//		return savings_id;
//	}
//	public void setSavings_id(int savings_id) {
//		this.savings_id = savings_id;
//	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mailid == null) ? 0 : mailid.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phonenumber == null) ? 0 : phonenumber.hashCode());
//		result = prime * result + primay_id;
//		result = prime * result + savings_id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mailid == null) {
			if (other.mailid != null)
				return false;
		} else if (!mailid.equals(other.mailid))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phonenumber == null) {
			if (other.phonenumber != null)
				return false;
		} else if (!phonenumber.equals(other.phonenumber))
			return false;
//		if (primay_id != other.primay_id)
//			return false;
//		if (savings_id != other.savings_id)
//			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [ Fullname=" + fullname + ", Surname=" + surname + ", mailid=" + mailid
				+ ", phonenumber=" + phonenumber + ", Address=" + address + ", password=" + password +"]";
	}
	
	
}
