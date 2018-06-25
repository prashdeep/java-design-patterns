package com.classpath.creational.factory;

public abstract class DBConnection {
	
	public abstract Object executeQuery(String st);
	
	public abstract int executeUpdate(String str);
	
	public abstract void execute(String query);
	
	public abstract void close();

}
