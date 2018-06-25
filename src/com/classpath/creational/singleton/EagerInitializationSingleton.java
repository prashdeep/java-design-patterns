package com.classpath.creational.singleton;

public class EagerInitializationSingleton {
	
	private static EagerInitializationSingleton instance = new EagerInitializationSingleton();
	
	private EagerInitializationSingleton() {
		//cannot be called outside the class.
	}
	
	public static EagerInitializationSingleton getInstance() {
		return instance;
	}

}
