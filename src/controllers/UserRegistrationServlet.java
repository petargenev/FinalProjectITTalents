package controllers;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UserDAO;
import exceptions.InvalidInputException;
import exceptions.UserException;
import models.User;

/**
 * Servlet implementation class UserRegistrationServlet
 */
@WebServlet("/Registration")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String password = request.getParameter("password");
		
		UserDAO userDao = new UserDAO();
		try {
			userDao.registerUser(new User(firstName, lastName, email, phoneNumber, password));
		} catch (UserException | InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
