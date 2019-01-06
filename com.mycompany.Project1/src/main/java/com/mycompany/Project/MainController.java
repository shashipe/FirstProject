package com.mycompany.Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value="/main", method= RequestMethod.GET)
	public String toOpenMainPage(Model model) {		
		return "main";// 
	}		
}
