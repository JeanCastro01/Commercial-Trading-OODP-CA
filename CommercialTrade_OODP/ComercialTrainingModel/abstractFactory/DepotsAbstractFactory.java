package abstractFactory;

import depots.Depots;

/**
 * 
 * This class is the Depot's Abstract factory Class
 * 
 * 
 * @author jeancastro
 *
 */

public abstract class DepotsAbstractFactory {

	protected int depotname;
	protected double initialcash;
	protected double productprice;
	protected double deliveryprice;
	protected int nativeProduct;
	protected int externalproductB;
	protected int externalproductC;

	/**
	 * 
	 * 
	 * Constructor with attributes for the Abstract Depots
	 * 
	 * 
	 * @param depotname        Abstract Depots Name
	 * 
	 * @param initialcash      Abstract Depots Initial Cash
	 * 
	 * @param productprice     Abstract Depots Product Price
	 * 
	 * @param deliveryprice    Abstract Depots Delivery Price
	 * 
	 * @param externalproductB Abstract Depots External Product B
	 * 
	 * @param externalproductC Abstract Depots External product C
	 * 
	 * @param nativeProduct    Abstract Depots Native Product
	 */

	public DepotsAbstractFactory(int depotname, double initialcash, double productprice, double deliveryprice,
			int externalproductB, int externalproductC, int nativeProduct) {

		this.depotname = depotname;
		this.initialcash = initialcash;
		this.productprice = productprice;
		this.deliveryprice = deliveryprice;
		this.nativeProduct = nativeProduct;
		this.externalproductB = externalproductB;
		this.externalproductC = externalproductC;

	}

	/**
	 * This is the obstract Depot class
	 * 
	 * @return this creatDepots
	 */

	public abstract Depots createDepots();

}
