package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.UserBean;
import com.example.demo.Service.UserService;

@RestController
public class UserController {

	@Autowired UserService userService;
	@PostMapping("/saveUser")
	public void saveUser(@RequestBody UserBean userBean)
	{
		
		userService.saveUser(userBean);
		
	}
}
