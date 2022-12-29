package com.emp.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.emp.model.Employee;

public class HelperClass {

	private String className = "com.mysql.cj.jdbc.Driver";
	private String uri = "jdbc:mysql://127.0.0.1:3306/emp";
	private String userName = "root";
	private String password = "root";
	private String insertQuery = "INSERT INTO employee (first_name,last_name,user_name,password,address,contact_number) VALUES (?,?,?,?,?,?)";

	public Object getConnection(Employee employee) {
		int result = 0;

		try {
			Class.forName(className);
			Connection connection = DriverManager.getConnection(uri, userName, password);
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, employee.getFirstName());
			statement.setString(2, employee.getLastName());
			statement.setString(3, employee.getUserName());
			statement.setString(4, employee.getPassword());
			statement.setString(5, employee.getAddress());
			statement.setString(6, employee.getContact());
			result = statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
