package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table
public class Supplier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int supid;
	
	@NotBlank(message="Supplier Name can't be blank")
	private String supname;
	
	@NotBlank(message="Supplier Brand can't be blank")
	private String supbrand;
	
	@NotBlank(message="Supplier address can't be blank")
	private String supaddress;

	public int getSupid() {
		return supid;
	}

	public void setSupid(int supid) {
		this.supid = supid;
	}

	public String getSupname() {
		return supname;
	}

	public void setSupname(String supname) {
		this.supname = supname;
	}

	public String getSupbrand() {
		return supbrand;
	}

	public void setSupbrand(String supbrand) {
		this.supbrand = supbrand;
	}

	public String getSupaddress() {
		return supaddress;
	}

	public void setSupaddress(String supaddress) {
		this.supaddress = supaddress;
	}

	
	
}
