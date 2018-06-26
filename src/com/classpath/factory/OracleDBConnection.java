package com.classpath.factory;

public class OracleDBConnection extends AbstractDBConnection{
	
	private OracleDatabase database = new OracleDatabase();
	
	public int insert(String sqlQuery) {
		return database.execute(sqlQuery);
	}
	
	public int update(String sqlQuery) {
		return database.execute(sqlQuery);
	}

	public int delete(String sqlQuery) {
		return database.execute(sqlQuery);
	}
}
