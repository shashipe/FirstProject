package com.mycompany.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mycompany.model.Registration;

public class RegistrationDAOImpl implements RegistrationDAO {

	@Override
	public void userSubmitted(Registration reg) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledatabase", "shashi",
					"shashi");
			
			String query = "insert into users values('" + reg.getUsername() + "',)";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			rs.next();
						
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
		
	}


		
	}


