package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.UserBean;
import com.example.demo.dao.CustomRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import com.example.demo.model.UserProfile;

@Service
public class UserService {
	
	
	 @Autowired
	  UserRepository userRepository;
	 @Autowired
	 CustomRepository customRepository;
	public void saveUserProfile(UserBean userBean) {


		 //user
		User user=new User();       
		user.setFirstName(userBean.getFirstName());
		user.setLastName(userBean.getLastName());
		user.setPassword(userBean.getPassword());
		user.setEmail(userBean.getEmail());
		
		//userProfile
		UserProfile userProfile=new UserProfile();
		userProfile.setAddress1(userBean.getAddress1());
		userProfile.setAddress2(userBean.getAddress2());
		userProfile.setCity(userBean.getCity());
		
		user.setUserProfile(userProfile);
		
		userProfile.setUser(user);
		System.out.println("before id--"+user.getId());
		userRepository.save(user);
		
		//customRepository.saveEmloyee();
		
		
		
	}
	public void saveUser(UserBean userBean) {


		
	}

}
