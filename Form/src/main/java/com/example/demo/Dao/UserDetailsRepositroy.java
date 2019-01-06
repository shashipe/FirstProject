package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.UserDetails;





	
	public interface UserDetailsRepositroy extends CrudRepository<UserDetails, Integer>{
		
		@Query("SELECT u from UserDetails u WHERE u.firstName=:name ")
		public List<UserDetails> findByFirstName(String name);
		

		
	 //List<UserDetails> findByFirstName(String firstName);
}
