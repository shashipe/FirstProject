package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Demo;



public interface UsersRepository extends CrudRepository<Demo, String>{

	
	
	
}