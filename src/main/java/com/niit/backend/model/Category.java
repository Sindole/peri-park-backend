package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int catid;

@NotBlank(message="Category name can't be blank")	
private String catname;

@NotBlank(message="Category description can't be blank")
private String catdesc;

public int getCatid() {
	return catid;
}

public void setCatid(int catid) {
	this.catid = catid;
}

public String getCatname() {
	return catname;
}

public void setCatname(String catname) {
	this.catname = catname;
}

public String getCatdesc() {
	return catdesc;
}

public void setCatdesc(String catdesc) {
	this.catdesc = catdesc;
}


}
