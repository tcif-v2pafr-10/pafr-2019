package nl.pafr.decorator;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StarbuzzCoffee {
	public static void main(String args[]) {
		NumberFormat formatter = new DecimalFormat("#0.00");     
//		Beverage beverage = new Espresso();
//		System.out.println(beverage.getDescription() + " - $ " + formatter.format(beverage.cost()));
//		Beverage beverage2 = new DarkRoast();
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Whip(beverage2);
//		System.out.println(beverage2.getDescription() + " - $ " + formatter.format(beverage2.cost()));
		Beverage bart = new Whip(new Mocha(new HouseBlend()));
		System.out.println(bart.getDescription() + " - $ " + formatter.format(bart.cost()));
	}
}
