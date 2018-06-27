package com.classpath.adaptor;

public class MismatchAdaptor {

	private Adaptee adaptee = new NewerAdaptee();
	private Source source;

	public MismatchAdaptor(Source source) {
		this.source = source;
	}

	public Adaptee getAdaptee() {
		return adaptee;
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void callAdaptee() {
		String email = source.exportEmailFormat();
		String name = email.substring(0, email.indexOf("@"));
		adaptee.executeOutput(name);
	}

}
