package observer;

import com.classpath.behavior.observer.Observer;

public interface Subject {
	
	public void subscribe(Observer observer);
	
	public void unsubscribe(Observer observer);
	
	public void notifyObservers();
	
	public Object getUpdate(Observer obj);

}
