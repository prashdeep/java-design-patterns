package com.classpath.adaptor;

public class Client {
	
	public static void main(String[] args) {
		SourceClass legacy = new SourceClass();
		MismatchAdaptor adaptor = new MismatchAdaptor(legacy);
		adaptor.callAdaptee();
	}
}
