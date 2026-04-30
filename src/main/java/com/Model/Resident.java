package com.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resident")
public class Resident {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer resid;
  @Column(unique = true)
  private String userName;
  @Column(nullable = false)
  private String password;
  @Column(unique = true)
  private String email;
  private String phone;
  private String role;
  public Resident() {
	super();
  }
  public Resident(Integer resid, String userName, String password, String email, String phone, String role) {
	super();
	this.resid = resid;
	this.userName = userName;
	this.password = password;
	this.email = email;
	this.phone = phone;
	this.role = role;
  }
  
  public Resident(String userName, String password, String email, String phone, String role) {
	super();
	this.userName = userName;
	this.password = password;
	this.email = email;
	this.phone = phone;
	this.role = role;
}
  public Integer getResid() {
	return resid;
  }
  public void setResid(Integer resid) {
	this.resid = resid;
  }
  public String getUserName() {
	return userName;
  }
  public void setUserName(String userName) {
	this.userName = userName;
  }
  public String getPassword() {
	return password;
  }
  public void setPassword(String password) {
	this.password = password;
  }
  public String getEmail() {
	return email;
  }
  public void setEmail(String email) {
	this.email = email;
  }
  public String getPhone() {
	return phone;
  }
  public void setPhone(String phone) {
	this.phone = phone;
  }
  public String getRole() {
	return role;
  }
  public void setRole(String role) {
	this.role = role;
  }
  @Override
  public String toString() {
	return "Resident [resid=" + resid + ", userName=" + userName + ", password=" + password + ", email=" + email
			+ ", phone=" + phone + ", role=" + role + "]";
  }
   
}
