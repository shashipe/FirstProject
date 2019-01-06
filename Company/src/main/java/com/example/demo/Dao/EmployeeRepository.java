package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.EmployeeDetails;
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDetails,Integer>
{

}
