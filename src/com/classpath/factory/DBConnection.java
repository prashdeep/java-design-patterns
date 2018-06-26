package com.classpath.factory;

public class DBConnection extends AbstractDBConnection{
	
	private Database database = new Database();
	
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
