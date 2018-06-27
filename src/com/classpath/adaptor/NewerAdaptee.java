package com.classpath.adaptor;

public class NewerAdaptee implements Adaptee{

	@Override
	public void executeOutput(String username) {
		System.out.println("Your name is "+username);
		
	}

	

}
