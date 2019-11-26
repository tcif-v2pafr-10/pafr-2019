package nl.pafr.observer;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		weatherData.addObserver(new ForecastDisplay());
		weatherData.addObserver(new StatisticsDisplay());
		weatherData.addObserver(new CurrentConditionsDisplay());
		
		weatherData.measurementsChanged(27.0f, 90.0f, 1000.0f);
		weatherData.measurementsChanged(23.0f, 90.0f, 1005.0f);
		weatherData.measurementsChanged(22.0f, 90.0f, 1005.0f);
		weatherData.measurementsChanged(21.0f, 91.0f, 1006.0f);
	}

}
