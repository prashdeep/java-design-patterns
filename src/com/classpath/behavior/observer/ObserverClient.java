package com.classpath.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverClient {
	
	public static void main(String[] args) {
		Observer ob1 = new Subscriber("Pradeep");
		Observer ob2 = new Subscriber("Kiran");
		
		
		List<Observer> subscriberList = new ArrayList<>();
		subscriberList.add(ob1);
		subscriberList.add(ob2);
		
		MagazineBroadCaster broadcaster = new MagazineBroadCaster(subscriberList);
		ob1.setSubject(broadcaster);
		ob2.setSubject(broadcaster);
		broadcaster.postMessage("New content from Magazine ..");
	}

}
