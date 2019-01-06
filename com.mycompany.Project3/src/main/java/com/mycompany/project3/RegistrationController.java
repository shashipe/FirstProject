package com.mycompany.project3;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class RegistrationController {
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		
		
		return "reg";
	}
}
