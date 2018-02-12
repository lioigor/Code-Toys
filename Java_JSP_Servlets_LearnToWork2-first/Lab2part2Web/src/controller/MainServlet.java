package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import model.ReverseLinePermutation;

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

		String inputedLine = request.getParameter("inputData");

		HttpSession session = request.getSession(true);

		if (inputedLine.equals("")) {
			session.setAttribute("labelRevByArray", "Error! You don't entered a string...");
			session.setAttribute("resultRevByArray", "Try again!");
			session.setAttribute("labelRevByStack", "");
			session.setAttribute("reultRevByStack", "");
			session.setAttribute("labelRevByStrBuild", "");
			session.setAttribute("reultRevByStrBuild", "");
			session.setAttribute("labelRevByRecursion", "");
			session.setAttribute("reultRevByRecursion", "");

		} else {

			boolean sessionStep = (Boolean) session.getAttribute("sessionStep");

			if (sessionStep) {
				ReverseLinePermutation lineStor = new ReverseLinePermutation(inputedLine);

				String[] reversedLinesDifferentMethods = new String[4];
				long[] runtimeDiffMethods = new long[4];

				long startTime = System.nanoTime();
				reversedLinesDifferentMethods[0] = lineStor.reverseByArray();
				long timeSpent = System.nanoTime() - startTime;
				runtimeDiffMethods[0] = timeSpent;

				startTime = System.nanoTime();
				reversedLinesDifferentMethods[1] = lineStor.reverseByStack();
				timeSpent = System.nanoTime() - startTime;
				runtimeDiffMethods[1] = timeSpent;

				startTime = System.nanoTime();
				reversedLinesDifferentMethods[2] = lineStor.reverseByStringBuilder();
				timeSpent = System.nanoTime() - startTime;
				runtimeDiffMethods[2] = timeSpent;

				startTime = System.nanoTime();
				reversedLinesDifferentMethods[3] = ReverseLinePermutation.reverseRecursion(inputedLine, 0);
				timeSpent = System.nanoTime() - startTime;
				runtimeDiffMethods[3] = timeSpent;

				session.setAttribute("labelRevByArray",
						"[Done for " + runtimeDiffMethods[0] + " nsec" + "] - Reverse line by using an Array: ");
				session.setAttribute("resultRevByArray", reversedLinesDifferentMethods[0]);
				session.setAttribute("labelRevByStack",
						"[Done for " + runtimeDiffMethods[1] + " nsec" + "] - Reverse line by using Stack: ");
				session.setAttribute("reultRevByStack", reversedLinesDifferentMethods[1]);
				session.setAttribute("labelRevByStrBuild",
						"[Done for " + runtimeDiffMethods[2] + " nsec" + "] - Reverse line by using StringBuilder: ");
				session.setAttribute("reultRevByStrBuild", reversedLinesDifferentMethods[2]);
				session.setAttribute("labelRevByRecursion",
						"[Done for " + runtimeDiffMethods[3] + " nsec" + "] - Reverse line by using Recursion: ");
				session.setAttribute("reultRevByRecursion", reversedLinesDifferentMethods[3]);

			} else {

				session.setAttribute("labelRevByArray", "Here you will see the result...");
				session.setAttribute("resultRevByArray", "");
				session.setAttribute("labelRevByStack", "");
				session.setAttribute("reultRevByStack", "");
				session.setAttribute("labelRevByStrBuild", "");
				session.setAttribute("reultRevByStrBuild", "");
				session.setAttribute("labelRevByRecursion", "");
				session.setAttribute("reultRevByRecursion", "");

			}

		}

		response.sendRedirect("shufflesString.jsp");

	}

}
