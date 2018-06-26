package com.classpath.factory;

public class OracleDBConnectionFactory {
	
	private static OracleDBConnectionFactory connectionFactory = new OracleDBConnectionFactory();
	private OracleDBConnectionFactory() {}
	
	public static OracleDBConnectionFactory getInstance(String url, String username, String password){
		return connectionFactory;
	}
	
	public OracleDBConnection getConnection() {
		return new OracleDBConnection();
	}

}
