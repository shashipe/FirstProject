package com.mycompany.models;

public class Registration {
String username, password, age;

public Registration() {
	super();
	// TODO Auto-generated constructor stub
}

public Registration(String username, String password, String age) {
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

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

@Override
public String toString() {
	return "Registration [username=" + username + ", password=" + password + ", age=" + age + "]";
}

}
