package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController {

	@Autowired UserService userService;
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}
	
	
	
	@PostMapping("/saveUser")
	public void saveUser(@RequestBody User user)
	{
		userService.save(user);
	}
	@DeleteMapping("/deleteUser/{id}")
	public void delete(@PathVariable String id)
	{
		userService.delete(id);
	}
}
