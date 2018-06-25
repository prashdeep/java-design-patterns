package com.classpath.behavior.observer;

import java.util.HashSet;
import java.util.Set;

public class MagazineBroadCaster implements Subject {

	private Set<Observer> observers = new HashSet<>();

	private String content;

	public MagazineBroadCaster(Set<Observer> observerList) {
		this.observers.addAll(observerList);
	}
	
	public MagazineBroadCaster() {
		//default no argument constructor
	}

	@Override
	public void register(Observer obj) {
		if (obj != null)
			observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		Set<Observer> observersLocal = null;
		observersLocal = new HashSet<>(this.observers);
		for (Observer obj : observersLocal) {
			obj.update();
		}

	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.content;
	}

	// method to post message to the topic
	public void postMessage(String content) {
		System.out.println("BroadCasting updated content to all the subscribers:" + content);
		this.content = content;
		notifyObservers();
	}

}
