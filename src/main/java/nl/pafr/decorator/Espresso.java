package nl.pafr.decorator;
public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.9900;
	}
}