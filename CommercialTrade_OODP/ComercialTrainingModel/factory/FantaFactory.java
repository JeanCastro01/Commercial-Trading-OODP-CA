package factory;

import java.util.Random;

import abstractFactory.ProductsAbstractFactory;
import products.Fanta;
import products.Products;

/**
 * 
 * This is the Fanta Factory class that extends the Product Abstract Factory
 * class
 * 
 * @author jeancastro
 *
 */

public class FantaFactory extends ProductsAbstractFactory {

	/**
	 * Constructor with attributes for the Fanta Factory
	 * 
	 * 
	 * 
	 * @param name     Fanta's Name
	 * @param quantity Fanta's Quantity
	 * @param price    Fanta's Price
	 */

	public FantaFactory(String name, int quantity, double price) {
		super(name, quantity, price);
	}

	/**
	 * 
	 * This class is responsible to set
	 * 
	 * - quantity and price as random numbers
	 * 
	 * 
	 * Returs new Fanta object with the random parameters created.
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

		// TODO Auto-generated method stub
		return new Fanta("Fanta", quantity, price);
	}
}
