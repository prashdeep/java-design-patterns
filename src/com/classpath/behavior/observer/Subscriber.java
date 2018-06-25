package com.classpath.behavior.observer;

public class Subscriber implements Observer {

	private String subscriberName;
	private Subject content;

	public Subscriber(String name) {
		this.subscriberName = name;
	}

	@Override
	public void update() {
		String message = (String) content.getUpdate(this);
		System.out.println("Updated content "+message);
	}

	@Override
	public void setSubject(Subject sub) {
		this.content = sub;
	}

}
