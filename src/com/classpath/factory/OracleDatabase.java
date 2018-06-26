package com.classpath.factory;

public class OracleDatabase {
	
	private static int counter = 0;
	
	public int execute(String sql) {
		System.out.println("Inserted into the database;");
		counter++;
		return counter;
	}
}
