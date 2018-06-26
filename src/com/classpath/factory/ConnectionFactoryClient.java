package com.classpath.factory;

public class ConnectionFactoryClient {

	public static void main(String[] args) {
		DBConnectionFactory connectionFactory = DBConnectionFactory.getInstance("jdbc:mysql://localhost:3306/dbname",
				"root", "welcome");
		
		DBConnection dbConnection = connectionFactory.getConnection();
		dbConnection.insert("insert into users value('Pradeep','Kumar')");
	}

}
