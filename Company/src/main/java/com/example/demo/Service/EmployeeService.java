package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeRepository;
import com.example.demo.Entity.EmployeeDetails;
@Service
public class EmployeeService {

	@Autowired EmployeeRepository employeeRepository;



	public void save(EmployeeDetails employeeDetails) {
		employeeRepository.save(employeeDetails);		
	}



	public void delete(int id) {
		employeeRepository.deleteById(id);
	}







	public void getEmployee(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
