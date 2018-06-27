package com.classpath.behavior.template;

public abstract class AbstractTemplate {
	
	public void execute() {
		init();
		
		service();
		
		destroy();
	}

	 void destroy() {
		System.out.println("Cleaning up the resources ...");
	}

	 abstract void service();

	 void init() {
		System.out.println("Default init method..");
		
	}
	

}
