package com.mycompany.dao;
import com.mycompany.models.Login;



public interface LoginDAO {
	
	public boolean verifyUser(Login login);
	
}
