package lioigor22DAO;

import java.sql.Statement;

public abstract class AbstractDAO {
	
	protected Connector connector;

	public void close() {
		connector.closeConnection();
	}

	protected void closeStatement(Statement statement) {
		connector.closeStatement(statement);
	}
}
