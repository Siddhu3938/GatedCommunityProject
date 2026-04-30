package com.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPLAINT")
public class Complaint {

    @Id
    @Column(name = "COMPLAINTID")
    private Integer complaintId;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "COMPLAINT")
    private String complaint;

    @Column(name = "FLATNUMBER")
    private String flatNumber;

    @Column(name = "DATE_COL")   // 🔥 FIX HERE
    private Date date;

    @Column(name = "PHONENUMBER")
    private String phoneNumber;

    @Column(name = "STATUS")
    private String status;
  public Complaint() {
	super();
	// TODO Auto-generated constructor stub
}

  public Complaint(Integer complaintId, String email, String complaint, String flatNumber, Date date, String phoneNumber,
		String status) {
	super();
	this.complaintId = complaintId;
	this.email = email;
	this.complaint = complaint;
	this.flatNumber = flatNumber;
	this.date = date;
	this.phoneNumber = phoneNumber;
	this.status = status;
  }

  public Complaint(String email, String complaint, String flatNumber, Date date, String phoneNumber, String status) {
	super();
	this.email = email;
	this.complaint = complaint;
	this.flatNumber = flatNumber;
	this.date = date;
	this.phoneNumber = phoneNumber;
	this.status = status;
  }
  

  public Complaint(String complaint, String flatNumber, String phoneNumber) {
	super();
	this.complaint = complaint;
	this.flatNumber = flatNumber;
	this.phoneNumber = phoneNumber;
}

  public Integer getComplaintId() {
	return complaintId;
  }

  public void setComplainId(Integer complaintId) {
	this.complaintId = complaintId;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public String getComplaint() {
	return complaint;
  }

  public void setComplaint(String complaint) {
	this.complaint = complaint;
  }

  public String getFlatNumber() {
	return flatNumber;
  }

  public void setFlatNumber(String flatNumber) {
	this.flatNumber = flatNumber;
  }

  public Date getDate() {
	return date;
  }

  public void setDate(Date date) {
	this.date = date;
  }

  public String getPhoneNumber() {
	return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }

  @Override
  public String toString() {
	return "Complaint [complaintId=" + complaintId + ", email=" + email + ", complaint=" + complaint + ", flatNumber="
			+ flatNumber + ", date=" + date + ", phoneNumber=" + phoneNumber + ", status=" + status + "]";
  }

}
