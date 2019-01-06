package com.mycompany.model;

public class Reg {
String userName,emailId,password;
int age;
public Reg() {
	super();
	// TODO Auto-generated constructor stub
}
public Reg(String userName, String emailId, String password, int age) {
	super();
	this.userName = userName;
	this.emailId = emailId;
	this.password = password;
	this.age = age;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
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
	return "Reg [userName=" + userName + ", emailId=" + emailId + ", password=" + password + ", age=" + age + "]";
}


}
