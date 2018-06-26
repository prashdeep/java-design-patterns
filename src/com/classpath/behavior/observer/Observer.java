package com.classpath.behavior.observer;

public interface Observer {
	
	// method to update the observer, used by subject
	public void publish();

	// attach with subject to observe
	public void setSubject(Subject sub);

}
