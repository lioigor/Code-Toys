package lio.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import lio.model.AuthenticationPassword;

/**
 * Servlet implementation class ServletTask1
 */
@WebServlet("/ServletTask1")
public class ServletTask1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		AuthenticationPassword ap = new AuthenticationPassword("hello");
		
		boolean checkPassword = ap.validate(password);
		
	    HttpSession session = request.getSession();
	    
	    if((username.equals("Логин")) || (password.equals("Пароль")))
	    	session.setAttribute("result", "fields must be not empty...");
	    else
	    if(checkPassword)
	    	session.setAttribute("result", username + " your pass is true :)");
	    else
	    	session.setAttribute("result", username + " your pass is false :(");
	    
	    response.sendRedirect("autorizationForm/inputPassword.jsp");
		
	}

}
