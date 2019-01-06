package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.Employee;
import com.example.demo.Beans.Response;
import com.example.demo.Dao.EmployeeRepository;
import com.example.demo.Entity.EmployeeDetails;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired EmployeeService  employeeService;
	@Autowired EmployeeRepository employeeRepository;
	@GetMapping("/get")
	public String getMessage()
	{
		return "shashi";
	}
	
	@GetMapping("/getEmployee/{id}")
	public Response getEmployee(@PathVariable int id)
	{
		Response response=new Response();
		employeeService.getEmployee(id);
		return response;
		
	}
	@PostMapping("/saveEmployee")
	public Response saveEmployee(@RequestBody Employee employee)
	{
		Response response=new Response();
	EmployeeDetails employeeDetails =new EmployeeDetails();
	employeeDetails.setId(employee.getId());
	employeeDetails.setName(employee.getName());
	employeeService.save(employeeDetails);
		return response;
	}
	@PutMapping("/updateEmployee/{id}")
	public Response updateEmployee(@RequestBody Employee employee, @PathVariable String id )
	{
		
		
		
		
		return null;
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public Response deleteEmployee(@PathVariable int id)
	{		
		Response response=new Response();
		employeeService.delete(id);
		return response;
		
	}
}
