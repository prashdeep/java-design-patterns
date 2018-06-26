package com.classpath.polymorphism;

public class Padietric extends Doctor {
	
	@Override
	public void treatPatient() {
		treatKids();
	}
	public void treatKids() {
		System.out.println("Treating kids ..");
	}

}
