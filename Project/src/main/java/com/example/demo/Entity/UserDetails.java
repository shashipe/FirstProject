package com.example.demo.Entity;
public class UserDetails {
	private String userName;
	private String password;
	private String fname;
	private String lname;
	private int age;
	public UserDetails() {
		super();
		
	}
	public UserDetails(String userName, String password, String fname, String lname, int age) {
		super();
		this.userName = userName;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
