package com.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pannel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)   
	private long id;
	
	@Column(name = "username")
	private String  username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phone_number")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "job_type")
    private String job_type;

	public Pannel(long id, String username, String password, String phone, String email, String job_type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.job_type = job_type;
	}

	public Pannel() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	

}
