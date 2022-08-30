package design.patterns.observer.pattern.subject.impl;

import java.util.ArrayList;

import design.patterns.observer.pattern.observer.Subject;
import design.patterns.observer.pattern.subject.Observer;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private float temperature;
	private float humidity;
	private float pressure;

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
		}

	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}

	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();		
	
	}

}
