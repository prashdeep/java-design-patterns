package com.classpath.polymorphism;

public class Ortho extends Doctor {
	
	
	public void treatPatient() {
		conductXRay();
		conductCTScan();
	}
	
	private void conductXRay() {
		System.out.println("Conducting X Ray");
	}
	
	private void conductCTScan() {
		System.out.println("Conducting CT scan");
	}

}
