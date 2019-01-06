package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.User;
import com.example.demo.Dao.UserDetailsRepositroy;
import com.example.demo.Service.UserService;

@RestController
@Component 
public class UserController {

	@Autowired 
	UserService userService;
	
	
	@PostMapping("/user")
	public void createUser(@RequestBody User user)
	{
		userService.save(user);
	}

}
