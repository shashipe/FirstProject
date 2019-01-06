package com.mycompany.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Login {
	
	@NotEmpty(message="username should not be empty")
	@Email(message="user should valid email")
	private String username;	
	
	@NotEmpty
	@Size(min=6, max=45)
	private String password;
	
	@Min(16)
	@Max(90)	
	private int age;

	public Login() {
		super();
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
