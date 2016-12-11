package com.goalife.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class User{
	
	private int userid;
	
	@Size(min=1, max=30, message="First Name must be between 1 and 30 characters")
	private String first_name;
	
	@Size(min=1, max=30, message="Last Name must be between 1 and 30 characters")
	private String last_name;
	
	@Size(min=2, max=40)
	@Pattern(regexp=".+@.+\\..+", message="Wrong email!")
	private String email;
	
	@Size(min=2, max=30)
	private String password;
	
	@NotNull
	@Size(min=2, max=30)
	private String confirmPassword;
	
	@NotNull
	@Size(min=2, max=30)
	private String city;
	
	@NotNull
	@Size(min=2, max=30)
	private String country;
	
	
	private String dateOfBirth;
	private String createdOn;
	
	public User() {
	}
	
	public User(String first_name, String last_name, String email, String password) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}


	public User(String first_name, String last_name, String email, String password, String city, String country,
			String dateOfBirth, String createdOn) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.country = country;
		this.dateOfBirth = dateOfBirth;
		this.createdOn = createdOn;
	}



 
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	

}
