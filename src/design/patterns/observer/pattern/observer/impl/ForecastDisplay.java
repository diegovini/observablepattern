package design.patterns.observer.pattern.observer.impl;

import design.patterns.observer.pattern.observer.Subject;
import design.patterns.observer.pattern.subject.Observer;

public class ForecastDisplay implements Observer {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject subject;

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();

	}

	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append("Forecast device displaying temperature: ");
		sb.append(this.temperature);
		System.out.println(sb);
	}

}
