package com.oct2018.mvapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oct2018.mvapp.viewModel.Login;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public boolean verifyUser(Login login) {

		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "javaclass",
					"Abc123$%");
			String query = "select count(*) from users where username='" + login.getUsername() + "' and password='"
					+ login.getPassword() + "'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			rs.next();
			if (rs.getInt(1) == 1) {
				return true;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
				rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(stmt!=null) {
				stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(con!=null) {
				con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
