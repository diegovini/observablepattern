package design.patterns.observer.pattern.observer;

import design.patterns.observer.pattern.subject.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();

}
