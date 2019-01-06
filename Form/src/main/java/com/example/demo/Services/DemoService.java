package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Beans.UserBean;
import com.example.demo.Dao.CustomRepository;
import com.example.demo.Dao.UserDetailsRepositroy;
import com.example.demo.Dao.UserRepository;
import com.example.demo.Entity.UserDetails;
import com.example.demo.Entity.UserProfile;



@Service
public class DemoService {
	
	  @Autowired
	  UserDetailsRepositroy userDetailsRepositroy;
	  
	  
	  
	  @Autowired
	  CustomRepository customRepository;
	  @Autowired
	  UserRepository userRepository;
	  
	public String getServieName() {
		return "Demo Service";
	}
	
	
	public void saveUser(UserDetails userDetails) {
		


		userDetailsRepositroy.save(userDetails);

	}
	
public void saveUser1(UserBean userBean) {
		
UserDetails userdetails=new UserDetails();
userdetails.setFirstName(userBean.getFirstName());
userdetails.setLastName(userBean.getLastName());

userDetailsRepositroy.save(userdetails);




	}


public UserBean getUser(String id) {
  int  idvalue=Integer.parseInt(id);
  //enity
  UserDetails userDetails= userDetailsRepositroy.findOne(idvalue);
  //bean
  UserBean userBean=new UserBean();
  
  userBean.setFirstName(userDetails.getFirstName());
  userBean.setLastName(userDetails.getLastName());
  userBean.setId(userDetails.getId());
  userBean.setEmail(userDetails.getEmail());
  return userBean;
  
}


public void updateUser(UserBean userBean) {
	
	
UserDetails userdetails=new UserDetails();

userdetails.setId(userBean.getId());
userdetails.setFirstName(userBean.getFirstName());
userdetails.setLastName(userBean.getLastName());
userdetails.setEmail(userBean.getEmail());

userDetailsRepositroy.save(userdetails);

	
}


public void deleteUser(int id) {

	userDetailsRepositroy.deleteById(id);
	
}


public List<UserBean> getuserList() {
	List<UserBean> userBeanList=new ArrayList<UserBean>();
	
	
	List<UserDetails> userDetailsList=(List<UserDetails>) userDetailsRepositroy.findAll();
	
	
	for(UserDetails userDetails:userDetailsList) {
		
	   UserBean userBean=new UserBean();
	   userBean.setId(userDetails.getId());
	  userBean.setFirstName(userDetails.getFirstName());
	  userBean.setLastName(userDetails.getLastName());
	  userBean.setEmail(userDetails.getEmail());
	  //add the data to our lit
	  userBeanList.add(userBean);
	 
	  
	}
	
	return userBeanList;
}


public List<UserBean> userListByName(String name) {
List<UserBean> userBeanList=new ArrayList<UserBean>();
	
	List<UserDetails> userDetailsList=(List<UserDetails>) userDetailsRepositroy.findByFirstName(name);
	
//List<UserDetails> userDetailsList=(List<UserDetails>) customRepository.getFirstNamesLike(name);
	for(UserDetails userDetails:userDetailsList) {
		
	   UserBean userBean=new UserBean();
	  
	  userBean.setFirstName(userDetails.getFirstName());
	  userBean.setLastName(userDetails.getLastName());
	  //add the data to our lit
	  userBeanList.add(userBean);
	  
	}
	return userBeanList;
}


public List<UserBean> getFirstNamesLike(String name) {
List<UserBean> userBeanList=new ArrayList<UserBean>();
	
	
List<UserDetails> userDetailsList=(List<UserDetails>) customRepository.getFirstNamesLike(name);
	for(UserDetails userDetails:userDetailsList) {
		
	   UserBean userBean=new UserBean();
	  
	  userBean.setFirstName(userDetails.getFirstName());
	  userBean.setLastName(userDetails.getLastName());
	  //add the data to our lit
	  userBeanList.add(userBean);
	  
	}
	return userBeanList;
}


public  void saveData(){
	User u=new User();
	UserProfile up=new UserProfile();
	u.setFirstName("satya");
	u.setEmail("g1@gmail.com");
	u.setPassword("pwd");
	up.setAddress1("hyd");
	
u.setUserProfile(up);
up.setUser(u);
userRepository.save(u);
	
	
}

}
