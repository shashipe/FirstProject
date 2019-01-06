package com.mycompany.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.model.Users;
import com.mycompany.Repository.UserRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.Repository.UserRepository;
import com.mycompany.model.Users;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	@RequestMapping("/findAllUsers")
	public Iterable <Users> togetAllUsers()
	{
		
		return userRepository.findAll();
	}
	
	
	@RequestMapping("/getuserbyemail/{username}") // www.oct2018.com/getuserbyemail/harsha@gmail.com
	public Users getAnUserByEmail(@PathVariable("username") String eid) {

		Optional<Users> o = userRepository.findById(eid); // select * from users where username='harsha'

		if (o.isPresent()) {
			return o.get();
		} else {
			return new Users();
		}
	}

	@RequestMapping("/deleteuserbyemail/{email}")
	public Iterable<Users> deleteByUsername(@PathVariable("email") String eid) {
		userRepository.deleteById(eid);
		return userRepository.findAll();
	}

	@RequestMapping("/adduser/{email}/{pass}/{fname}/{lname}/{age}")
	public Iterable<Users> addnewUser(@PathVariable("email") String eid, @PathVariable("pass") String password,
			@PathVariable("fname") String firstname, @PathVariable("lname") String lastname,
			@PathVariable("age") Integer age) {

		Users u = new Users(eid, password, firstname, lastname, age);
		userRepository.save(u);
		return userRepository.findAll();
	}

	@RequestMapping("/verifyuser/{email}/{pswd}")
	public String verifyUser(@PathVariable("email") String eid, @PathVariable("pswd") String password) {

		Optional<Users> u = userRepository.findByUsernameAndPassword(eid, password);

		if (u.isPresent()) {
			return "ok";
		} else {
			return "oknot";
		}
	}

	@RequestMapping("/findByAge/{age}")
	public Iterable<Users> findbyageGreaterthan(@PathVariable("age") Integer age) {
		return userRepository.findAllByAgeGreaterThan(age);
	}

	
}
