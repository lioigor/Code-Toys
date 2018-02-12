package lioigor22Commands;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import lioigor22ControllerLogic.ActionCommnad;
import lioigor22ControllerLogic.ConfigurationManager;
import lioigor22DAO.AbstractDAO;
import lioigor22DAO.PatientDAO;
import lioigor22Model.Patient;

public class ExistingPatientListCommand implements ActionCommnad {
	
	@Override
	public String execute(HttpServletRequest request) {
		
		String page = null;

		PatientDAO dao = new PatientDAO();
		ArrayList<Patient> patients = new ArrayList<>();
		patients.addAll(dao.findAll());
		
		request.setAttribute("resultList", patients);
		
		page = ConfigurationManager.getProperty("path.page.exist");
		return page;
	}

}
