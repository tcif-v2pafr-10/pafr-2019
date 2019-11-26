package nl.pafr.decorator;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark roast";
	}

	public double cost() {
		return 0.9900;
	}
}
