package com.classpath.structural.proxy.main;

 class Target implements Subject{

	@Override
	public void request() {
		System.out.println("The request method called on Target object");
		
	}

}
