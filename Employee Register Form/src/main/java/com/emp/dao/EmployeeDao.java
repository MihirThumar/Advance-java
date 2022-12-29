package com.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.emp.model.Employee;

public class EmployeeDao {

	public Object registerEmployee(Employee employee) throws ClassNotFoundException {
		String insertQuery = "INSERT INTO employee (first_name,last_name,user_name,password,address,contact_number) VALUES (?,?,?,?,?,?)";
		int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/emp", "root", "root");
				PreparedStatement statement = connection.prepareStatement(insertQuery)) {
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