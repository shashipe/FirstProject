package com.oct2018.mvapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {


	@RequestMapping(value="/reg", method= RequestMethod.GET)
	public String toOpenRegistrPage(Model model) {		
		return "registration";// 
	}		
}
