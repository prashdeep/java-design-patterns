package com.classpath.creational.factory;

public  class MySQLDBConnectionFactory implements DBConnectionProvider{

	@Override
	public DBConnection getConnection() {
		// TODO Auto-generated method stub
		return new MySQLConnection();
	}

}
