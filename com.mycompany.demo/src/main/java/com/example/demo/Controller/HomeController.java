package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Demo;
import com.example.demo.Services.DemoService;
import com.example.demo.repository.UsersRepository;




@RestController
public class HomeController {
	@Autowired 	UsersRepository usersRepository;
	
	@GetMapping("/login")
	public String toOpenMain(Model model) {
		model.addAttribute("msg","Main Page");
		return "login"; // main.html   thymleaf
	}
	@GetMapping("/reg")
	public String toReg(Model model) {
		model.addAttribute("msg","Main Page");
		return "reg"; // main.html   thymleaf
	}



}
