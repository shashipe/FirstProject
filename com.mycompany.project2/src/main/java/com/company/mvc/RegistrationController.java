package com.company.mvc;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.dao.RegistrationDAO;
import com.mycompany.model.Login;
import com.mycompany.model.Registration;
@Controller
public class RegistrationController {
	@Autowired
	RegistrationDAO registrationDAO;
	@RequestMapping(value = {"/registration"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		model.addAttribute("registration", new Registration());
		return "registration";
	}
	
	@RequestMapping(value="/regSubmit", method=RequestMethod.POST)
	public String forLoginSubmit(@Valid @ModelAttribute("registration") Registration reg, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "registration";
		}
		
			
		
		
		else {
		registrationDAO.userSubmitted(reg);
			return "main"; // login.jsp
			
			
		}	
}
}
