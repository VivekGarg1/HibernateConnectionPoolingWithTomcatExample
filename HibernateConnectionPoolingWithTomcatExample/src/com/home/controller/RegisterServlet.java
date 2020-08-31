package com.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.home.dao.UserDao;
import com.home.model.User;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String lastName =request.getParameter("lastName");
		
		HttpSession session = request.getSession();
		session.setAttribute("firstName", firstName);
		session.setAttribute("lastName", lastName);
		
		User user=new User();
		user.setFirstName(firstName);
		user.setLastname(lastName);
		
		new UserDao().createUser(user);
		
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
	}

}
