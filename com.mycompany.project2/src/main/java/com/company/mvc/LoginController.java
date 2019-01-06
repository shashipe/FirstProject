package com.company.mvc;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.validation.BindingResult;

import com.mycompany.model.Login;

import com.mycompany.dao.LoginDAO;


@Controller
public class LoginController {
	
	@Autowired
	LoginDAO loginDAO;

	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		model.addAttribute("login", new Login());
		
		
		return "login";
	}
	
	
	@RequestMapping(value="/loginSubmit", method=RequestMethod.POST)
	public String forLoginSubmit(@Valid @ModelAttribute("login") Login login, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "login";
		}
		
		// IOC - Inversion Of Control		
		boolean isValidUser=loginDAO.verifyUser(login);
		
		if(isValidUser) {
			return "main";
		}
	else {
			model.addAttribute("loginError", "Invalid credentials");
			return "login"; // login.jsp
			
			
		}	
}
}