package com.example.demo.dao;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDao extends CrudRepository<User,String>{

	User findByUsername(String username);
}
