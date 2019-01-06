package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Beans.User;
import com.example.demo.Entity.UserDetails;
import com.example.demo.dao.Repo;
@Service
public class UserService {
	@Autowired Repo repo;
	Optional<UserDetails> userDetails=null;
	
	public void delete(String id) {
		UserDetails userDetails=new UserDetails();
			repo.deleteById(id);
		
	}

	public void 	saveUser(User user) {
UserDetails userDetails=new UserDetails();
userDetails.setAge(user.getAge());
userDetails.setFname(user.getFname());
userDetails.setLname(user.getLname());
userDetails.setUserName(user.getUserName());
userDetails.setPassword(user.getPassword());
repo.save(userDetails);
	}
	public void updateUser(UserDetails userDetails, String id) {
		Optional<UserDetails> userDetailss=repo.findById(id);
		userDetails.setAge(Integer.parseInt(id));
		repo.save(userDetails);
	}
}
