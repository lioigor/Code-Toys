package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import model.FindCharactersThatFoundFrequently;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = "/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String inputedText = request.getParameter("inputData");

		HttpSession session = request.getSession(true);

		if (inputedText.equals("")) {
			session.setAttribute("labelAll", "Error! You don't enter anything...");
			session.setAttribute("resultAll", "");
			session.setAttribute("labelFind", "");
			session.setAttribute("resultFind", "");

		} else {

			boolean sessionStep = (Boolean) session.getAttribute("sessionStep");

			if (sessionStep) {

				FindCharactersThatFoundFrequently findCharacters = new FindCharactersThatFoundFrequently(inputedText);

				session.setAttribute("labelAll", "You entered the following text:  ");
				session.setAttribute("resultAll", inputedText);
				session.setAttribute("labelFind", "Characters, the most frequently occurring:  ");
				session.setAttribute("resultFind", findCharacters.find().toString());

			} else {

				session.setAttribute("labelAll", "");
				session.setAttribute("resultAll", "");
				session.setAttribute("labelFind", "");
				session.setAttribute("resultFind", "");

			}

		}

		response.sendRedirect("foundFrequently.jsp");

	}

}
