package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Beans.User;
import com.example.demo.Dao.UserDetailsRepositroy;
import com.example.demo.Entity.UserDetails;
@Service
public class UserService {
	@Autowired UserDetailsRepositroy userDetailsRepositroy;
	@Autowired UserDetails userDetails;
	public void save(User user) {
		// TODO Auto-generated method stub
		userDetails.setUserName(user.getUserName());
		userDetails.setPassword(user.getPassword());
		userDetails.setFname(user.getFname());
		userDetails.setLname(user.getLname());
		userDetails.setAge(user.getAge());
		userDetailsRepositroy.save(userDetails);
	}
}
