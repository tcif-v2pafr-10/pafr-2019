package nl.pafr.observer;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {
	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay() {
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
	
	public void update(Observable o, Object arg) {
		lastPressure = currentPressure;
		currentPressure = ((WeatherData) o).getPressure();
		display();
		
	}
}
