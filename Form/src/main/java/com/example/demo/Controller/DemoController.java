package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.Response;
import com.example.demo.Beans.UserBean;
import com.example.demo.Entity.UserDetails;
import com.example.demo.Services.DemoService;
import com.example.demo.Services.TestService;




@RestController
public class DemoController {
	
	 @Autowired	
	 DemoService demoService;
	 
	 @Autowired	
	 TestService testService;
	 
	 @RequestMapping("/hello")
	    public  String index(){
		 
		//String s= demoService.getServieName();
	      return "java";
	    }
	

	 @RequestMapping("/hello1")
	    public  String index1(){
		
		//String s= demoService.getServieName();
	      return "Hello";
	    }
	 

	 @RequestMapping("/hello2/{id}")
	    public  String index3(@PathVariable String id){
		 
		//String s= demoService.getServieName();
	      return "Hello";
	    }
	 
	 
	 @CrossOrigin(origins = "*")
	 @PostMapping("/saveUser")
	  public @ResponseBody Response saveUser(@RequestBody UserDetails userDetails){
		 
		 System.out.println("firstName--"+userDetails.getFirstName());
		 System.out.println("lastsName--"+userDetails.getLastName());
		 
		 demoService.saveUser(userDetails);
		 
		 Response  response=new Response();
		 response.setStatus("success");
		 
		 return response;
	  }
	 @CrossOrigin(origins = "*")
	 @GetMapping("/getUser/{id}")
	  public  UserBean getUser(@PathVariable String id){
		 


		UserBean userBean= demoService.getUser(id);
		
		 return userBean;
	  }
	 @CrossOrigin(origins = "*")
	 @PutMapping("/updateUser")
	  public  Response updateUser(@RequestBody UserBean userBean){
		 
		 System.out.println("firstName--"+userBean.getFirstName());
		 System.out.println("lastsName--"+userBean.getLastName());
		 Response  response=new Response();
		 try {
		 demoService.updateUser(userBean);
		 response.setStatus("success");
		 response.setStatusCode("200");
		 }catch(Exception e) {
			 response.setStatus("fial");
			 response.setStatusCode("500");
			 response.setMessage("server problem");
		 }
		 
		 
		 return response;
	  }
	 @CrossOrigin(origins = "*")
	 @GetMapping("/deleteUser/{id}")
	  public  Response deleteUser(@PathVariable int id){
		 


		 demoService.deleteUser(id);
		 
		 Response  response=new Response();
		 response.setStatus("success");
		 
		 return response;
	  }
	 @CrossOrigin(origins = "*")
	 @GetMapping("/getuserList")
	  public   List<UserBean> getuserList(){
		 


		 List<UserBean> list=demoService.getuserList();
		 
		 return list;
	  }
	 
	 
	 
	 @PostMapping("/saveUser1")
	  public  Response saveUser1(@RequestBody UserBean userBean){
		 
		 System.out.println("firstName--"+userBean.getFirstName());
		 System.out.println("lastsName--"+userBean.getLastName());
		 
		 demoService.saveUser1(userBean);
		 
		 Response  response=new Response();
		 response.setStatus("success");
		 
		 return response;
	  }
	 
	 
	
	 
	 @GetMapping("/userListByName/{name}")
	  public  Response userListByName(@PathVariable String name){
		 


		 List<UserBean> list=demoService.userListByName(name);
		 
		 Response  response=new Response();
		 response.setUserList(list);
		 response.setStatus("success");
		 response.setStatusCode("200");
		 
		 return response;
	  }
	 @GetMapping("/getFirstNamesLike/{name}")
	  public  Response getFirstNamesLike(@PathVariable String name){
		 


		 List<UserBean> list=demoService.getFirstNamesLike(name);
		 
		 Response  response=new Response();
		 response.setUserList(list);
		 response.setStatus("success");
		 response.setStatusCode("200");
		 
		 return response;
	  }
	 


}
