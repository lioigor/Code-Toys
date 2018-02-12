package lioigor22Commands;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import lioigor22ControllerLogic.ActionCommnad;
import lioigor22ControllerLogic.ConfigurationManager;
import lioigor22ControllerLogic.MessageManager;
import lioigor22DAO.PatientDAO;
import lioigor22Model.Patient;

public class ViewDiagnosisListCommand implements ActionCommnad {

	@Override
	public String execute(HttpServletRequest request) {
		
		String page = null;
		
		String diagnosis = request.getParameter("diagnosis");
		
		if ((diagnosis == null)  || (diagnosis.isEmpty())) {
			
			request.setAttribute("result", MessageManager.getProperty("message.emptyfields"));
			
			page = ConfigurationManager.getProperty("path.page.diagnosis");
			return page;
		} else {
			
			PatientDAO dao = new PatientDAO();
			ArrayList<Patient> patients = new ArrayList<>();
			patients.addAll(dao.findDiagnosis(diagnosis));
			
			request.setAttribute("resultList", patients);
			request.setAttribute("diagnosis", diagnosis);
			
			page = ConfigurationManager.getProperty("path.page.resultdiagnosis");
			return page;
		}

}
}
