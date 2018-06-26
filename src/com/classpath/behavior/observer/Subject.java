package com.classpath.behavior.observer;

public interface Subject {

	public void subscribe(Observer obj);

	public void unSubscribe(Observer obj);

	public void notifyObservers();

	public Object getUpdate(Observer obj);
}
