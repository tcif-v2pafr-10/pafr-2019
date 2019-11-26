package nl.pafr.observer;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

	private float temperature;
	private float humidity;

	// DisplayElement implementation
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ " °C degrees and " + humidity + "% humidity");
	}
	
	public void update(Observable o, Object arg) {
		this.temperature = ((WeatherData) o).getTemperature();
		this.humidity = ((WeatherData) o).getHumidity();
		display();
	}
}
