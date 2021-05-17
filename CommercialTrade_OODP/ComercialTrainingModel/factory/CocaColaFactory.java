package factory;

import java.util.Random;
import abstractFactory.ProductsAbstractFactory;
import products.CocaCola;
import products.Products;

/**
 * 
 * This is the Coca Cola Factory class that extends the Product Abstract Factory
 * class
 * 
 * @author jeancastro
 *
 */

public class CocaColaFactory extends ProductsAbstractFactory {

	/**
	 * Constructor with attributes for the Coca Cola Factory
	 * 
	 * 
	 * 
	 * @param name     Coca Cola's Name
	 * @param quantity Coca Cola's Quantity
	 * @param price    Coca Cola's Price
	 */

	public CocaColaFactory(String name, int quantity, double price) {
		super(name, quantity, price);
	}

	/**
	 * 
	 * This class is responsible to set
	 * 
	 * - quantity and price as Random numbers
	 * 
	 * 
	 * Returs new Coca Cola object with the random parameters created.
	 * 
	 */

	@Override
	public Products createProducts() {
		// TODO Auto-generated method stub

		// https://www.baeldung.com/java-generating-random-numbers-in-range

		Random objGenerator = new Random();
		for (int iCount = 0; iCount < 1; iCount++) {
			quantity = objGenerator.nextInt(50 - 15) + 15;

		}

		Random objGenerator2 = new Random();
		for (int iCount2 = 0; iCount2 < 1; iCount2++) {
			price = objGenerator2.nextInt(10 - 1) + 1;

		}

		return new CocaCola("Coca Cola", quantity, price);
	}
}
