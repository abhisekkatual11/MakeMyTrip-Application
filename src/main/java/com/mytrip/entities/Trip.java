package com.mytrip.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tripping_details")
public class Trip {
	@Id
	@Column(name="Aadhar_Number",length = 12,nullable = false)
	private Long aadharId;
	@Column(name="Name",length = 50,nullable = false)
	private String name;
	@Column(name="Address",length = 228,nullable = false)
	private String address;
	@Column(name="Email",length = 128,nullable = false,unique = true)
	private String email;
	@Column(name="Mobile",length = 10,nullable = false)
	private Long mobile;
	public Long getAadharId() {
		return aadharId;
	}
	public void setAadharId(Long aadharId) {
		this.aadharId = aadharId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
}
