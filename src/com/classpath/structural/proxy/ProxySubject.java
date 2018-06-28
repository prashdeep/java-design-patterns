package com.classpath.structural.proxy;

public class ProxySubject implements Subject {

	private Target target = new Target();

	@Override
	public void request() {
		System.out.println("The request method called on proxy");
		target.request();
	}

}
