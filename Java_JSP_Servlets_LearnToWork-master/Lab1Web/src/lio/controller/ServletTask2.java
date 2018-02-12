package lio.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import lio.model.SearchNumbers;

/**
 * Servlet implementation class ServletTask2
 */
@WebServlet("/ServletTask2")
public class ServletTask2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String inputData = request.getParameter("inputData");
		
		String corectData = inputData.replaceAll(" ", "  ");
		
		String[] massData = corectData.split(",");
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		HttpSession session = request.getSession();
		
		boolean error = false;
		try{
			for(int i = 0; i < massData.length ; i++){
				array.add(Integer.parseInt(massData[i]));
			}
		}catch(NumberFormatException nfe){
			 
			error = true;
		}
		if(error){
			session.setAttribute("labelAll", "Ошибка! Неверно введено данные, попробуйте ввести целые числа через запятую...");
		    session.setAttribute("labelDiv", "");
		    session.setAttribute("resultAll", "");
		    session.setAttribute("resultDiv", "");
		    response.sendRedirect("mainForm/inputDivide.jsp");
		}
		else{
			
		SearchNumbers searchnum = new SearchNumbers(array);
		
		String result;
		result = searchnum.findNumToNewArray().toString();
	   
		session.setAttribute("labelAll", "Ваш массив: ");
	    session.setAttribute("labelDiv", "Делятся на 3 или на 9: ");
	    session.setAttribute("resultAll", corectData);
	    
	    if(result.equals("[]"))
	    	session.setAttribute("resultDiv", "Нет такого числа!");
	    else
	    	session.setAttribute("resultDiv", result);
	    
	    session.setAttribute("checkSessionStep", true);
	    
	    response.sendRedirect("mainForm/inputDivide.jsp");
		}

	}

}
