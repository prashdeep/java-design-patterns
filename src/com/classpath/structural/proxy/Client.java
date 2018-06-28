package com.classpath.structural.proxy;

import com.classpath.structural.proxy.main.ProxySubject;
import com.classpath.structural.proxy.main.Subject;

public class Client {
	
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.request();
	}

}
