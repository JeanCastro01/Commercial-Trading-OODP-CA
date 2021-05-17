package factory;

import abstractFactory.ProductsAbstractFactory;
import products.Products;

/**
 * 
 * 
 * 
 * @author jeancastro
 *
 */
public class ProductFactoryCreate {

	/**
	 * Constructor with attributes for the Product Factory Create
	 * 
	 * 
	 * @param factory Product's Factory
	 * @return this Factory Prodcut's
	 */

	public static Products getProducts(ProductsAbstractFactory factory) {
		return factory.createProducts();
	}

}