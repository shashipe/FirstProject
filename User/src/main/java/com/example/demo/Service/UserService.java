package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Bean.UserBean;
import com.example.demo.Entity.User;
import com.example.demo.Entity.UserProfile;

@Service
public class UserService {

	public void saveUser(UserBean userBean) {

		User user=new User();
		UserProfile userProfile =new UserProfile();
		user.setId(userBean.getId());
		user.setFirstName(userBean.getFirstName());
		user.setLastName(userBean.getLastName());
		user.setEmail(userBean.getEmail());
		user.setPassword(userBean.getPassword());
		
		//user-profile
		userProfile.setAddress1(userBean.getAddress1());
		userProfile.setAddress2(userBean.getAddress2());
		userProfile.setCity(userBean.getCity());
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
	}

}
