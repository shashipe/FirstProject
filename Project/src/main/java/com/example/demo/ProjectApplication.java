package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.demo.Service.UserService;

@SpringBootApplication
@Configuration
@EnableWebMvc

public class ProjectApplication {

	@Autowired UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
