package com.example.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="address")
public class Address {
	@Id
private String aid;
public String getAid() {
	return aid;
}

public void setAid(String aid) {
	this.aid = aid;
}

public Address(String aid, String street, String city, String state, EmployeeDetails employeeDetails) {
	super();
	this.aid = aid;
	this.street = street;
	this.city = city;
	this.state = state;
}

private String street;
private String city;
private String state;



public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(String street, String city, String state, EmployeeDetails employeeDetails) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
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




}
