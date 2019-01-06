package com.example.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.Models.Registration;



public interface UserRepository extends CrudRepository <Registration, String>{

	public Iterable<Registration> findAllByAgeGreaterThan(Integer age);
}

