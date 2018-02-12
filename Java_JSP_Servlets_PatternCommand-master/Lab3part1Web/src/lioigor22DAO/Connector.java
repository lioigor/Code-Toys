package lioigor22DAO;

import java.util.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connector {

	private Connection connection;

	public Connector() {
		try {
			ResourceBundle resource = ResourceBundle.getBundle("resources/database");
			String url = resource.getString("url");
			String user = resource.getString("user");
			String pass = resource.getString("password");
			Properties prop = new Properties();
			prop.put("user", user);
			prop.put("password", pass);
			connection = DriverManager.getConnection(url, prop);
		} catch (MissingResourceException e) {
			System.err.println("properties file is missing " + e);
		} catch (SQLException e) {
			System.err.println("not obtained connection " + e);
		}

	}

	public Statement getStatement() throws SQLException {
		if (connection != null) {
			Statement statement = connection.createStatement();
			if (statement != null) {
				return statement;
			}
		}
		throw new SQLException("connection or statement is null");
	}

	public void closeStatement(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				System.err.println("statement is null " + e);
			}
		}
	}

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.err.println(" wrong connection" + e);
			}
		}
	}
	public Connection getConnection(){
		
		return connection;
			
	}
}