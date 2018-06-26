package com.classpath.behavior.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MagazineBroadCaster implements Subject {

	private List<Observer> observers = new ArrayList<>();

	private String content;

	public MagazineBroadCaster(Set<Observer> observerList) {
		this.observers.addAll(observerList);
	}
	
	public MagazineBroadCaster() {
		//default no argument constructor
	}

	@Override
	public void subscribe(Observer obj) {
		observers.add(obj);
	}

	@Override
	public void unSubscribe(Observer obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		observersLocal = new ArrayList<>(this.observers);
		for (Observer obj : observersLocal) {
			obj.publish();
		}

	}


	// method to post message to the topic
	public void postMessage(String content) {
		System.out.println("BroadCasting updated content to all the subscribers:" + content);
		this.content = content;
		notifyObservers();
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this;
	}


}
