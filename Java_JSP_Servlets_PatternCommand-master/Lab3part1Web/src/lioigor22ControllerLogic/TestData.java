package lioigor22ControllerLogic;

import lioigor22DAO.PatientDAO;
import lioigor22Model.Patient;

public class TestData {

	public static void main(String[] args) {
		
		PatientDAO dao = new PatientDAO();
		boolean status = dao.add(new Patient(22, "patientSurName", "patientName", "patientPatronymic", "patientAddress", 547547,
				564645, "patientDiagnosis"));
		
		System.out.println("WTF1");
		System.out.println(status);

	}

}
