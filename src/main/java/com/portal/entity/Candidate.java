package com.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="candidates")
public class Candidate {
	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	  @Column(name = "first_name", nullable = false, length = 20)
	private String firstName;
	
	  @Column(name = "last_name", nullable = false, length = 20)	
	private String lastName;
	
	  @Column(nullable = false, unique = true, length = 45)
	private String email;
	
	  @Column(name="gender")
	private String gender;
	
	@Column(name="dob")
	private String dob;  
	
	@Size(max = 15)
    @Column(name = "phone_number", unique = true)
	private String phoneNo;
	
	@Size(max = 15)
    @Column(name = "alt_number", unique = true)
	private String altPhone;
	
	@Column(name="parmanent_address")
	private String pAddress;
	
	@Column(name="temp_address")
	private String tAddress;
	
	@Column(name="job_type")
	private String jobType;
	
	@Column(name="role")
	private String role;
	
	
	@Column(name="experience")
	 private String experience;
	 
	@Column(name="about")
	 private String about;
	
	 @Column(name="status")
	 private String status;



	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param gender
	 * @param dob
	 * @param phoneNo
	 * @param altPhone
	 * @param pAddress
	 * @param tAddress
	 * @param jobType
	 * @param role
	 * @param experience
	 * @param about
	 * @param status
	 */
	public Candidate(long id, String firstName, String lastName, String email, String gender, String dob,
			@Size(max = 15) String phoneNo, @Size(max = 15) String altPhone, String pAddress, String tAddress,
			String jobType, String role, String experience, String about, String status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.altPhone = altPhone;
		this.pAddress = pAddress;
		this.tAddress = tAddress;
		this.jobType = jobType;
		this.role = role;
		this.experience = experience;
		this.about = about;
		this.status = status;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAltPhone() {
		return altPhone;
	}

	public void setAltPhone(String altPhone) {
		this.altPhone = altPhone;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public String gettAddress() {
		return tAddress;
	}

	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gender=" + gender + ", dob=" + dob + ", phoneNo=" + phoneNo + ", altPhone=" + altPhone
				+ ", pAddress=" + pAddress + ", tAddress=" + tAddress + ", jobType=" + jobType + ", role=" + role
				+ ", experience=" + experience + ", about=" + about + ", status=" + status + "]";
	}  

	 
	 
	 
	 
}
