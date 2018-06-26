package com.classpath.polymorphism;

public abstract class Doctor {

	public abstract void treatPatient();
	
	public void setAppointment() {
		System.out.println("Your appoinment is confirmed");
	}
}
