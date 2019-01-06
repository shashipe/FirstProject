package com.mycompany.Controllers;


import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	 @RequestMapping("/login")
	  public String index(Model model){
	  //    logger.info("Setting index page title to Mainstay - Web");
	      model.addAttribute("title","Mainstay - Web");
	      return "login.jsp";
	  }
}
