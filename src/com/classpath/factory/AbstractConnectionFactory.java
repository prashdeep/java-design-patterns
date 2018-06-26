package com.classpath.factory;

public class AbstractConnectionFactory {

	private static DBConnectionFactory dbConnectionFactory = DBConnectionFactory.getInstance("", "", "");
	private static OracleDBConnectionFactory oracleDBConnectionFactory = OracleDBConnectionFactory.getInstance("", "",
			"");

	public static AbstractDBConnection getConnection(DBType dbType) {
		switch (dbType) {
		case MYSQL:
			return dbConnectionFactory.getConnection();

		case ORACLE:
			return oracleDBConnectionFactory.getConnection();
		}

		return null;
	}

}
