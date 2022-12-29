package com.emp.dao;

import com.emp.helper.HelperClass;
import com.emp.model.Employee;

public class EmployeeDao {

	private HelperClass helperClass = new HelperClass();

	public Object registerEmployee(Employee employee) throws ClassNotFoundException {
		Object connection = helperClass.getConnection(employee);
		return connection;
	}

}