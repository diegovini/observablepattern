package design.patterns.observer.pattern.application;

import design.patterns.observer.pattern.observer.impl.CurrentConditionsDisplay;
import design.patterns.observer.pattern.observer.impl.ForecastDisplay;
import design.patterns.observer.pattern.observer.impl.StatisticsDisplay;
import design.patterns.observer.pattern.subject.impl.WeatherData;

public class Application {
	
	public static void main (String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		
		weatherData.registerObserver(forecastDisplay);
		weatherData.registerObserver(currentConditionsDisplay);
		
		System.out.println("======Measurements changing======\n");
		weatherData.setMeasurements(1, 2, 3);
		
		System.out.println("\n*****Adding a new observer*****\n");
		weatherData.registerObserver(statisticsDisplay);
		
		System.out.println("======Measurements changing======\n");
		weatherData.setMeasurements(10, 20, 30);
		
		System.out.println("\n*****removing the first observer*****\n");
		weatherData.removeObserver(forecastDisplay);
		
		System.out.println("======Measurements changing======\n");
		weatherData.setMeasurements(100, 200, 300);
		
		
		
		
	}

}
