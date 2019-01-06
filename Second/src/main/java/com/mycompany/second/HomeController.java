package com.mycompany.second;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.model.Login;
import com.mycompany.model.Reg;


@Controller
public class HomeController {
	
	
	@RequestMapping(value = {"/","home"}, method = RequestMethod.GET)
	public String home() {
		
		
		return "home";
		
	}
		
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("login", new Login());// command
		return "login";
		
	}
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String reg(Model model) {
		
		model.addAttribute("registration", new Reg());
		return "registration";
		
	}
	
	@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public String about(Model model) {
		
		//model.addAttribute("registration", new Reg());
		return "aboutus";
		
	}
	
	
	@RequestMapping(value="/loginSubmit", method=RequestMethod.POST)
	public String forLoginSubmit(@ModelAttribute("login") Login login, Model model) {
		if(login.getPassword().length()<6) {
			model.addAttribute("loginError", "Password Too short");
			return "login"; // login.jsp
		}else if(login.getUsername().equals("harsha@gmail.com")  && login.getPassword().equals("123456")) {
			return "main";
		}else {
			model.addAttribute("loginError", "Invalid credentials");
			return "login"; // login.jsp
		}
	}
	
	@RequestMapping(value="/regSubmit", method=RequestMethod.POST)
	public String forRegSubmit(@ModelAttribute("registration") Reg reg, Model model) throws SQLException {
		return "main";
		
		
	
	}
		
		
		
}
