package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Demo;
public interface Repository extends JpaRepository<Demo, String>
{

	void save(Bean bean);

	

}
