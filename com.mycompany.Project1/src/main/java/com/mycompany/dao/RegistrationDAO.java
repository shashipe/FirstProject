package com.mycompany.dao;

import com.mycompany.models.Login;

public interface RegistrationDAO {
	public boolean verifyUser(Login login);
}
