package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int userid;
private String username;
private String password;

@Transient
private String conpassword;
private String email;
private String address;
private double phone;
private String role;
private String enabled;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConpassword() {
	return conpassword;
}
public void setConpassword(String conpassword) {
	this.conpassword = conpassword;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getPhone() {
	return phone;
}
public void setPhone(double phone) {
	this.phone = phone;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getEnabled() {
	return enabled;
}
public void setEnabled(String enabled) {
	this.enabled = enabled;
}

}
