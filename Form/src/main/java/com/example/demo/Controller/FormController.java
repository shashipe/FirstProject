package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.Form;
import com.example.demo.Beans.Response;
import com.example.demo.Dao.FormDao;
import com.example.demo.Entity.FormDetails;
import com.example.demo.Services.FormService;

@RestController
public class FormController {

	@Autowired FormService formService;
	@Autowired FormDao formDao;
	@PostMapping("/saveUser")
	public Response saveUser(@RequestBody Form form)
	{
		Response response =new Response();
		FormDetails formDetails=new FormDetails();
		formDetails.setId(form.getId());
		formDetails.setName(form.getName());
		formService.save(formDetails);
		
		 response.setStatus("success");
		 
		 return response;
	}
	@GetMapping("/hello")
	public String display()
	{
		return "hello";
	}
	@GetMapping("/getUser/{id}")
	public Optional<FormDetails> getUser(@PathVariable String id)
	{
		return formDao.findById(id);
	}
	
	@PutMapping("/updateUser/{id}/{changeValue}")
	public Response updateUser(@PathVariable String id, String changeValue, @RequestBody FormDetails form)
	{
		
		formService.update(id, changeValue, form);
		return null;
	}
}
