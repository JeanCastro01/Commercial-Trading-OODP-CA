
package factory;

import java.util.Random;
import abstractFactory.ProductsAbstractFactory;
import products.Pepsi;
import products.Products;

/**
 * 
 * This is the Pepsi Factory class that extends the Product Abstract Factory
 * class
 * 
 * @author jeancastro
 *
 */

public class PepsiFactory extends ProductsAbstractFactory {

	/**
	 * Constructor with attributes for the Pepsi Factory
	 * 
	 * 
	 * 
	 * @param name     Pepsi's Name
	 * @param quantity Pepsi's Quantity
	 * @param price    Pepsis Price
	 */

	public PepsiFactory(String name, int quantity, double price) {
		super(name, quantity, price);
	}

	/**
	 * 
	 * This class is responsible to set
	 * 
	 * - quantity and price as random numbers
	 * 
	 * 
	 * Returs new Pepsi object with the random parameters created.
	 * 
	 */

	@Override
	public Products createProducts() {

		// https://www.baeldung.com/java-generating-random-numbers-in-range

		Random objGenerator = new Random();
		for (int iCount = 0; iCount < 1; iCount++) {
			quantity = objGenerator.nextInt(50 - 15) + 15;

		}

		Random objGenerator2 = new Random();
		for (int iCount2 = 0; iCount2 < 1; iCount2++) {
			price = objGenerator2.nextInt(10 - 1) + 1;

		}

		return new Pepsi("Pepsi", quantity, price);
	}
}
