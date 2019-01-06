package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.BookPublisherBean;
import com.example.demo.Beans.EmployeeBean;
import com.example.demo.Beans.Response;
import com.example.demo.Beans.UserBean;
import com.example.demo.Services.BookPublisherService;
import com.example.demo.Services.EmployeeService;
import com.example.demo.Services.UserService;



@RestController
public class UserController {
	
	  @Autowired
	  UserService userService;
	  @Autowired 
	  EmployeeService  employeeService;
	  @Autowired
	  BookPublisherService  bookPublisherService;
	  
	
	 @PostMapping("/saveUserProfile")
	  public  Response saveUserProfile(@RequestBody UserBean userBean){
		 
		 System.out.println("firstName--"+userBean.getFirstName());
		 System.out.println("lastsName--"+userBean.getLastName());
		 
		 userService.saveUserProfile(userBean);
		 
		 Response  response=new Response();
		 response.setStatus("success");
		 
		 return response;
	  }
	 
	 
	 @PostMapping("/saveEmplyee")
	  public  Response saveEmployee(@RequestBody EmployeeBean employeeBean){
		 
		
		 employeeService.saveEmployee(employeeBean);
		 
		 Response  response=new Response();
		 response.setStatus("success");
		 
		 return response;
	  }
	 
	 @PostMapping("/saveEmplyeeAddress")
	  public  Response saveEmplyeeAddress(@RequestBody EmployeeBean employeeBean){
		 
		
		 employeeService.saveEmplyeeAddress(employeeBean);
		 
		 Response  response=new Response();
		 response.setStatus("success");
		 
		 return response;
	  }
	 
	 
	 
	 @PostMapping("/saveBookPublisher")
	  public  Response saveBookPublisher(@RequestBody BookPublisherBean bookPublisherBean){
		 
		
		 bookPublisherService.saveBookPublisher(bookPublisherBean);
		 
		 Response  response=new Response();
		 response.setStatus("success");
		 
		 return response;
	  }
	 
	 
}
