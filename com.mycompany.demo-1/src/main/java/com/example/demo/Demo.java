package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity()
public class Demo {
	@Id
private String fname;
private String lname;
public Demo() {
	super();
	// TODO Auto-generated constructor stub
}
public Demo(String fname, String lname) {
	super();
	this.fname = fname;
	this.lname = lname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
@Override
public String toString() {
	return "Demo [fname=" + fname + ", lname=" + lname + "]";
}

}
