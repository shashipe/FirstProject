package com.example.demo.Services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.EmployeeBean;
import com.example.demo.dao.CustomRepository;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;
import com.example.demo.model.Employee_Address;

@Service
public class EmployeeService {

	 @Autowired
	 EmployeeRepository employeeRepository;
	 @Autowired
	 CustomRepository customRepository;
	/* @Autowired
	 BookPublisherRepository bookPublisherRepository;
*/
	public void saveEmployee(EmployeeBean employeeBean) {
		
		Employee emp=new Employee();
		emp.setEmpName(employeeBean.getEmpName());
		
		
		
		
		Employee_Address ea=new Employee_Address();
		ea.setCity(employeeBean.getCity());
		ea.setState(employeeBean.getState());
		ea.setEmployee(emp);
		
		
		Set<Employee_Address> addresSet=new HashSet<Employee_Address>();
		addresSet.add(ea);
		
		
		
		emp.setEmployeeAddress(addresSet);
		
		
		employeeRepository.save(emp);
		
		
		


		
	}

	public void saveEmplyeeAddress(EmployeeBean employeeBean) {
		
		/*
		Employee_Address employee_Address= new Employee_Address();
		employee_Address.setCity(employeeBean.getCity());
		employee_Address.setState(employeeBean.getState());
		
		
		Employee emp=new Employee();
		emp.setEmpId(employeeBean.getEmpId());
		
		employee_Address.setEmployee(emp);
		customRepository.saveEmplyeeAddress(employee_Address);*/
		


	
	}
	 
}
