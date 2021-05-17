package abstractFactory;

import products.Products;

/**
 * 
 * This class is the Product's Abstract factory Class
 * 
 * 
 * @author jeancastro
 *
 */

public abstract class ProductsAbstractFactory {

	protected String name;
	protected int quantity;
	protected double price;

	/**
	 * 
	 * Constructor with attributes for the Abstract Depots
	 * 
	 * 
	 * @param name     Abstract Product's Name
	 * 
	 * @param quantity Abstract Product's Quantity
	 * 
	 * @param price    Abstract Product's Price
	 */

	public ProductsAbstractFactory(String name, int quantity, double price) {

		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	/**
	 * This is the obstract Product's class
	 * 
	 * @return this creatProducts
	 */

	public abstract Products createProducts();

}
