package lio.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String task = request.getParameter("task");
			
		//response.setContentType("text/html; charset=utf-8");
		
		if(task.equals("task1")){
			
			HttpSession session = request.getSession();
			session.setAttribute("result", "Authorization...");
		
				response.sendRedirect("autorizationForm/inputPassword.jsp");
		
//			RequestDispatcher view = request.getRequestDispatcher("autorizationForm/inputPassword.jsp");
//	        try {
//	            view.forward(request, response);
//	        } catch (ServletException e) {
//	            System.out.print(e.toString());
//	 
//	        } catch (IOException e) {
//	            System.out.print(e.toString());
//	        }
			
		} else if(task.equals("task2")){
			
			HttpSession session = request.getSession();
		    session.setAttribute("checkSessionStep", false);
		    session.setAttribute("labelAll", "");
		    session.setAttribute("labelDiv", "");
		    session.setAttribute("resultAll", "");
		    session.setAttribute("resultDiv", "");
			response.sendRedirect("mainForm/inputDivide.jsp");
			
		}
			
	}

}
