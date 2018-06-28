package com.classpath.structural.proxy;

public class Target implements Subject{

	@Override
	public void request() {
		System.out.println("The request method called on Target object");
		
	}

}
