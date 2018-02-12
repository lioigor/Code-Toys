package lioigor22DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import lioigor22Model.Patient;

public class PatientDAO extends AbstractDAO {

	public static final String SQL_SELECT_ALL_PATIENTS = "SELECT * FROM Patient";
	public static final String SQL_INSERT_NEW_PATIENT = "INSERT into Patient(idPatient, Patientsurname, Patientname, "
			+ "Patientpatronymic, Patientaddress, Patientdiagnosis, Patientphone, Patientmedicalcard ) VALUES  (?, ?, ?, ?, ?, ?, ?, ?)";

	public PatientDAO() {
		this.connector = new Connector();
	}

	public ArrayList<Patient> findAll() {

		ArrayList<Patient> patients = new ArrayList<>();
		Statement st = null;

		try {
			st = connector.getStatement();
			ResultSet resultSet = st.executeQuery(SQL_SELECT_ALL_PATIENTS);
			while (resultSet.next()) {
				Patient patient = new Patient(resultSet.getInt("idPatient"), resultSet.getString("Patientsurname"),
						resultSet.getString("Patientname"), resultSet.getString("Patientpatronymic"),
						resultSet.getString("Patientaddress"), resultSet.getInt("Patientphone"),
						resultSet.getInt("Patientmedicalcard"), resultSet.getString("Patientdiagnosis"));

				patients.add(patient);
			}
		} catch (SQLException e) {
			System.err.println("SQL exception (request or table failed): " + e);
		} finally {
			this.closeStatement(st);
		}
		return patients;
	}

	public ArrayList<Patient> findDiagnosis(String diagnosis) {

		String sqlQuery = "SELECT * FROM Patient WHERE Patientdiagnosis='" + diagnosis + "'";

		ArrayList<Patient> patients = new ArrayList<>();

		Statement st = null;

		try {
			st = connector.getStatement();
			ResultSet resultSet = st.executeQuery(sqlQuery);
			while (resultSet.next()) {
				Patient patient = new Patient(resultSet.getInt("idPatient"), resultSet.getString("Patientsurname"),
						resultSet.getString("Patientname"), resultSet.getString("Patientpatronymic"),
						resultSet.getString("Patientaddress"), resultSet.getInt("Patientphone"),
						resultSet.getInt("Patientmedicalcard"), resultSet.getString("Patientdiagnosis"));

				patients.add(patient);
			}
		} catch (SQLException e) {
			System.err.println("SQL exception (request or table failed): " + e);
		} finally {
			this.closeStatement(st);
		}
		return patients;

	}

	public ArrayList<Patient> findCard(int minrange, int maxrange) {

		String sqlQuery = "SELECT * FROM Patient WHERE Patientmedicalcard > " + minrange + " AND Patientmedicalcard < "
				+ maxrange;

		ArrayList<Patient> patients = new ArrayList<>();

		Statement st = null;

		try {
			st = connector.getStatement();
			ResultSet resultSet = st.executeQuery(sqlQuery);
			while (resultSet.next()) {
				Patient patient = new Patient(resultSet.getInt("idPatient"), resultSet.getString("Patientsurname"),
						resultSet.getString("Patientname"), resultSet.getString("Patientpatronymic"),
						resultSet.getString("Patientaddress"), resultSet.getInt("Patientphone"),
						resultSet.getInt("Patientmedicalcard"), resultSet.getString("Patientdiagnosis"));

				patients.add(patient);
			}
		} catch (SQLException e) {
			System.err.println("SQL exception (request or table failed): " + e);
		} finally {
			this.closeStatement(st);
		}
		return patients;

	}

	private PreparedStatement getPreparedStatement(String sqlquery) {

		PreparedStatement ps = null;
		try {
			ps = connector.getConnection().prepareStatement(sqlquery);
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e);
		}
		return ps;
	}

	private boolean insertPatient(PreparedStatement preparedStatement, Patient patient) {
		boolean flag = false;
		try {
			preparedStatement.setInt(1, patient.getId());
			preparedStatement.setString(2, patient.getSurName());
			preparedStatement.setString(3, patient.getName());
			preparedStatement.setString(4, patient.getPatronymic());
			preparedStatement.setString(5, patient.getAddress());
			preparedStatement.setInt(6, patient.getPhone());
			preparedStatement.setInt(7, patient.getMedicalCard());
			preparedStatement.setString(8, patient.getDiagnosis());
			preparedStatement.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return flag;
	}

	public boolean add(Patient patient) {

		System.out.println("WTF2");
		boolean flag = insertPatient(getPreparedStatement(SQL_INSERT_NEW_PATIENT), patient);

		return flag;
	}

}
