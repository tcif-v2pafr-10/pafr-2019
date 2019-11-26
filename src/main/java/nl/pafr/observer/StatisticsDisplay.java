package nl.pafr.observer;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer {

	private float minT = (float) 100.0;
	private float maxT = (float) -100.0;

	public void display() {
		System.out.println("Statistics: min " + minT + " °C max " + maxT+ " °C");
	}
	
	public void update(Observable o, Object arg) {
		float temp = ((WeatherData) o).getTemperature();
		if (temp > maxT) {
			maxT = temp;
		}
		if (temp < minT) {
			minT = temp;
		}
		display();
	}

}
