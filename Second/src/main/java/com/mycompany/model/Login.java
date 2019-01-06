package com.mycompany.model;

public class Login {
String username,password;
int age;
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(String username, String password, int age) {
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
	return "Login [username=" + username + ", password=" + password + ", age=" + age + "]";
}

}
