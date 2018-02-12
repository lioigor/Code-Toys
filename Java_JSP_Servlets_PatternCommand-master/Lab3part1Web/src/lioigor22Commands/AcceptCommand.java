package lioigor22Commands;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import lioigor22ControllerLogic.ActionCommnad;
import lioigor22ControllerLogic.ConfigurationManager;
import lioigor22ControllerLogic.MessageManager;
import lioigor22DAO.PatientDAO;
import lioigor22Model.Patient;

public class AcceptCommand implements ActionCommnad {

	@Override
	public String execute(HttpServletRequest request) {

		String page = null;

		String patientName = request.getParameter("name");
		String patientSurName = request.getParameter("surname");
		String patientId = request.getParameter("id");
		String patientPatronymic = request.getParameter("patronymic");
		String patientDiagnosis = request.getParameter("diagnosis");
		String patientMedicalCard = request.getParameter("medicalCard");
		String patientAddress = request.getParameter("address");
		String patientPhone = request.getParameter("phone");

		if ((patientName == null) || (patientId == null) || (patientSurName == null) || (patientPatronymic == null)
				|| (patientDiagnosis == null) || (patientMedicalCard == null) || (patientAddress == null)
				|| (patientPhone == null) || (patientName.isEmpty()) || (patientId.isEmpty())
				|| (patientSurName.isEmpty()) || (patientPatronymic.isEmpty()) || (patientDiagnosis.isEmpty())
				|| (patientMedicalCard.isEmpty()) || (patientAddress.isEmpty()) || (patientPhone.isEmpty())) {

			request.setAttribute("result", MessageManager.getProperty("message.emptyfields"));

			page = ConfigurationManager.getProperty("path.page.accept");
			return page;
		} else {

			int nid = 0, nphone = 0, nmedicalCard = 0;

			boolean error = false;
			try {

				nid = Integer.parseInt(patientId);
				nphone = Integer.parseInt(patientPhone);
				nmedicalCard = Integer.parseInt(patientMedicalCard);

			} catch (NumberFormatException nfe) {

				error = true;
			}
			if (error) {
				request.setAttribute("result", MessageManager.getProperty("message.notnumber"));

				page = ConfigurationManager.getProperty("path.page.accept");
				return page;
			} else {

				PatientDAO dao = new PatientDAO();
				boolean status = dao.add(new Patient(nid, patientSurName, patientName, patientPatronymic, patientAddress, nphone,
						nmedicalCard, patientDiagnosis));
				
				System.out.println("WTF1");
				request.setAttribute("result", "hello");

				page = ConfigurationManager.getProperty("path.page.accept");
				return page;
			}

		}
	}

}
