package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
(name="user_profile")
public class UserProfile implements Serializable{
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private String upid;
	 private String address1;
	 private String address2;
	 private String street;
	 private String city;
	 private String state;
	 private String country;
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "id", nullable = false)
	    private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserProfile(String upid, String address1, String address2, String street, String city, String state,
			String country) {
		super();
		this.upid = upid;
		this.address1 = address1;
		this.address2 = address2;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getUpid() {
		return upid;
	}
	public void setUpid(String upid) {
		this.upid = upid;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	 
}