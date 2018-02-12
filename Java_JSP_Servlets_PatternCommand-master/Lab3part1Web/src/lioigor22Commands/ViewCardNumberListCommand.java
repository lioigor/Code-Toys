package lioigor22Commands;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import lioigor22ControllerLogic.ActionCommnad;
import lioigor22ControllerLogic.ConfigurationManager;
import lioigor22ControllerLogic.MessageManager;
import lioigor22DAO.PatientDAO;
import lioigor22Model.Patient;

public class ViewCardNumberListCommand implements ActionCommnad {
	
	@Override
	public String execute(HttpServletRequest request) {
		
		String page = null;
		
		String minrangestr = request.getParameter("minrange");
		String maxrangestr = request.getParameter("maxrange");
		
		if ((minrangestr == null)  || (minrangestr.isEmpty()) || (maxrangestr == null)  || (maxrangestr.isEmpty())) {
			
			request.setAttribute("result", MessageManager.getProperty("message.emptyfields"));
			
			page = ConfigurationManager.getProperty("path.page.card");
			return page;
			
		} else {
			
			int minrange = 0, maxrange = 0;

			boolean error = false;
			try {

				minrange = Integer.parseInt(minrangestr);
				maxrange = Integer.parseInt(maxrangestr);

			} catch (NumberFormatException nfe) {

				error = true;
			}
			if(minrange < 0 || maxrange < 0)
				error = true;
			
			if (error) {
				
				request.setAttribute("result", MessageManager.getProperty("message.notnumberrange"));
				page = ConfigurationManager.getProperty("path.page.card");
				return page;
			}
			else{
				
				PatientDAO dao = new PatientDAO();
				ArrayList<Patient> patients = new ArrayList<>();
				patients.addAll(dao.findCard(minrange, maxrange));
				
				request.setAttribute("resultList", patients);
				request.setAttribute("interval", "" + minrange + " -> " + maxrange);
				
				page = ConfigurationManager.getProperty("path.page.resultcard");
				return page;
			}
			
		
		}

}

}
