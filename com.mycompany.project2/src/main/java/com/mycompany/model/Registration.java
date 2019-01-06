package com.mycompany.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Registration {
	@NotEmpty
private String username;
	@NotEmpty
private String password;
	@Min(20)
	@Max(45)
private int age;
public Registration() {
	super();
	// TODO Auto-generated constructor stub
}
public Registration(String username, String password, int age) {
	super();
	this.username = username;
	this.password = password;
	this.age = age;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Registration [username=" + username + ", password=" + password + ", age=" + age + "]";
}

}
