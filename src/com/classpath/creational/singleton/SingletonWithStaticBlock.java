package com.classpath.creational.singleton;

public class SingletonWithStaticBlock {
	
	private static SingletonWithStaticBlock instance;

	private SingletonWithStaticBlock() {
		//Cannot be called outside this class.
	}

	//static block for exception handling
	static {
		try {
			instance = new SingletonWithStaticBlock();
		} catch (Exception e) {
			//throw exception in case we cannot create the instance of the class.
			throw new RuntimeException("Exception occured in creating singleton instance" + e.getMessage());
		}
	}

	public static SingletonWithStaticBlock getInstance() {
		return instance;
	}

}
