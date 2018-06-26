package com.classpath.factory;

public class DBConnectionFactory {
	
	private static DBConnectionFactory connectionFactory = new DBConnectionFactory();
	private DBConnectionFactory() {}
	
	public static DBConnectionFactory getInstance(String url, String username, String password){
		return connectionFactory;
	}
	
	public DBConnection getConnection() {
		return new DBConnection();
	}

}
