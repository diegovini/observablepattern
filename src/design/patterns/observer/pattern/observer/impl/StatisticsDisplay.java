package design.patterns.observer.pattern.observer.impl;

import design.patterns.observer.pattern.subject.Observer;

public class StatisticsDisplay implements Observer{
	private float temperature;
	private float humidity;
	private float pressure;
	

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
	}
	
	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append("Statistics device displaying humidity: ");
		sb.append(this.humidity);				
		System.out.println(sb);		
	}

}
