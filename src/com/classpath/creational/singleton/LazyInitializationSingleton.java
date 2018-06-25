package com.classpath.creational.singleton;

public class LazyInitializationSingleton {
	
	private static LazyInitializationSingleton instance;

	private LazyInitializationSingleton() {
		//cannot be called outside this class.
	}

	public static LazyInitializationSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingleton();
		}
		return instance;
	}

}
