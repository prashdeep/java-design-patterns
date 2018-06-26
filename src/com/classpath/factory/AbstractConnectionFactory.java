package com.classpath.factory;

public class AbstractConnectionFactory {

	private static DBConnectionFactory dbConnectionFactory = DBConnectionFactory.getInstance("", "", "");
	private static OracleDBConnectionFactory oracleDBConnectionFactory = OracleDBConnectionFactory.getInstance("", "",
			"");

	public static AbstractDBConnection getConnection(String dbType) {
		if (dbType.equalsIgnoreCase("MYSQL")) {
			return dbConnectionFactory.getConnection();
		} else if (dbType.equalsIgnoreCase("ORACLE")) {
			return oracleDBConnectionFactory.getConnection();
		}
		return null;
	}

}
