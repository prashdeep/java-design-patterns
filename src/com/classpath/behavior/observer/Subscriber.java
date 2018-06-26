package com.classpath.behavior.observer;

public class Subscriber implements Observer {

	private String subscriberName;
	private Subject content;

	public Subscriber(String name) {
		this.subscriberName = name;
	}

	@Override
	public void publish() {
		String message = (String) content.getUpdate(this);
		
		System.out.println("Updated content for  "+this.subscriberName+ " message: "+message);
	}

	@Override
	public void setSubject(Subject sub) {
		this.content = sub;
	}

}
