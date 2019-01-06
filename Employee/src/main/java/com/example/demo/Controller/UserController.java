package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.User;
import com.example.demo.Entity.UserDetails;
import com.example.demo.Service.UserService;
import com.example.demo.dao.Repo;
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired 
	Repo repo;
@GetMapping("/hello")
public String message()
{
	return "Hello";
}
@GetMapping("/getUser/{id}")
public Optional<UserDetails> getUser(@PathVariable String id)
{
	return repo.findById(id);
}
@GetMapping("/getUser")
public String message1()
{
	return "Hellsdfsdfo";
}


@PostMapping("/saveUser")
public  User saveUser(@RequestBody User user){
	userService.saveUser(user);
	 return user;
	 
}
@DeleteMapping("/deleteUser/{id}")
public void deleteUser(@PathVariable String id)
{
	userService.delete(id);
}

@PutMapping("/updateUser/{emp}/{id}")
public void updateUser(@RequestBody UserDetails user,@PathVariable String id)
{
	userService.updateUser(user,id);
}

}
