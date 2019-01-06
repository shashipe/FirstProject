package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Beans.User;
import com.example.demo.Entity.UserDetails;

	@Repository
	public interface UserDetailsRepositroy extends JpaRepository<UserDetails, String>{

		

}
