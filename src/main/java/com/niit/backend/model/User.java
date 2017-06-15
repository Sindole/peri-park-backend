package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int userid;
@NotBlank(message="User name can't be blank")
private String username;
@NotBlank(message="FirstName can't be blank")
private String firstname;
private String lastname;
@NotBlank(message="Password can't be blank")
private String password;
@Transient
@NotBlank(message="ConfirmPassword can't be blank")
private String conpassword;
@NotBlank(message="Email can't be blank")
private String email;
@NotBlank(message="Address can't be blank")
private String address;
private String city;
@NotBlank(message="State can't be blank")
private String state;
@NotNull(message="Zip code can't be blank")
private int zip;
@NotNull(message="PhoneNumber can't be blank")
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

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
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

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
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
