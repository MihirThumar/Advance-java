package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.EmployeeDao;
import com.emp.model.Employee;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String userName = request.getParameter("user_name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");

		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setPassword(password);
		employee.setUserName(userName);
		employee.setAddress(address);
		employee.setContact(contact);

		EmployeeDao dao = new EmployeeDao();
		try {
			dao.registerEmployee(employee);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter writer = response.getWriter()) {
			writer.println("<h1>" + firstName + lastName + " SuccesFully registerd</h1><br><br>");
			writer.println("<h3><a href='/Employee_Register_Form'>Go back to registraion page</a></h3>");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}