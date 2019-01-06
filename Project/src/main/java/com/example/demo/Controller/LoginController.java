package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/submit/{id}/{pwd}")
	public String login(@PathVariable String id, String pwd)
	{
		if(id.equals("shashi"))
		return "success";
		else
			return "un-authorized";
	}
	@PostMapping("/user")
	public String login(@PathVariable String id)
	{
		
			return "";
	}
}
