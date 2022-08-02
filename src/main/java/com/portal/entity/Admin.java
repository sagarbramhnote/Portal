package com.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="admin")
public class Admin {

	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private  long id;
	
	 @Column(name = "first_name", nullable = false, length = 20)
	private String firstName;
	
	 @Column(nullable = false, unique = true, length = 45)
	private String email;
	
	 @Column(name="role")
	private String role;
	
	 @Size(max = 15)
	    @Column(name = "phone_number", unique = true)
	private String phoneNo;
	
	 
	 @Column(name="password")
	private String password;


	 
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param firstName
	 * @param email
	 * @param role
	 * @param phoneNo
	 * @param password
	 */
	public Admin(long id, String firstName, String email, String role, @Size(max = 15) String phoneNo,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.email = email;
		this.role = role;
		this.phoneNo = phoneNo;
		this.password = password;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstName=" + firstName + ", email=" + email + ", role=" + role + ", phoneNo="
				+ phoneNo + ", password=" + password + "]";
	}
	
	
	
	 
	 
	 
	
	
}
