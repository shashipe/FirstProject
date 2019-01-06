package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Beans.User;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;


@Service
public class UserService {
	 @Autowired
	  UserRepository userRepository;
	
	public void save(User user) {
		UserEntity userEntity=new UserEntity();
		userEntity.setName(user.getName());
		userEntity.setPassword(user.getPassword());		
		userRepository.save(userEntity);
	}

	public void delete(String id) {
		UserEntity userEntity= userRepository.findById(id);
		
	}

}
