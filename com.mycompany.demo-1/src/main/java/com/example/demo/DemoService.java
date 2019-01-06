package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DemoService {
	@Autowired Repository repository;

	public void saveUser(Bean bean) {
		repository.save(bean);
		
	}
}
