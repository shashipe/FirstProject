package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Beans.User;
import com.example.demo.Entity.UserDetails;

public interface Repo extends JpaRepository<UserDetails, String>{

	User save(User user);

}
