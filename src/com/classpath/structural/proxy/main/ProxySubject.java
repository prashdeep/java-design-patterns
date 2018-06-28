package com.classpath.structural.proxy.main;

public class ProxySubject implements Subject {

	private Target target = new Target();

	@Override
	public void request() {
		System.out.println("The request method called on proxy");
		target.request();
	}

}
