package depots;

/**
 * 
 * This class is for the Depots objects
 * 
 * 
 * @author jeancastro
 *
 */

public abstract class Depots {

	protected int depotName;
	protected double initialCash;
	protected double productPrice;
	protected double deliveryPrice;
	protected int nativeProduct;
	protected int externalproductB;
	protected int externalproductC;

	/**
	 * 
	 * This methods get native product
	 * 
	 * @return this native's products
	 */

	public int getNativeProduct() {
		return nativeProduct;
	}

	/**
	 * 
	 * This methods set native product
	 * 
	 * @return this product's price
	 */

	public void setNativeProduct(int nativeProduct) {
		this.nativeProduct = nativeProduct;
	}

	/**
	 * 
	 * This methods get External prodcut B
	 * 
	 * @return this external product's B
	 */

	public int getExternalproductB() {
		return externalproductB;
	}

	/**
	 * 
	 * This methods set product External prodcut B
	 * 
	 * @return this external product's B
	 */

	public void setExternalproductB(int externalproductB) {
		this.externalproductB = externalproductB;
	}

	/**
	 * 
	 * This methods get External prodcut C
	 * 
	 * @return this external product's C
	 */

	public int getExternalproductC() {
		return externalproductC;
	}

	/**
	 * 
	 * This methods set product External prodcut B
	 * 
	 * @return this external product's B
	 */

	public void setExternalproductC(int externalproductC) {
		this.externalproductC = externalproductC;
	}

	/**
	 * 
	 * This methods get Depot Name
	 * 
	 * @return this Depot's name
	 */

	public int getDepotName() {
		return depotName;
	}

	/**
	 * 
	 * This methods set Depot Name
	 * 
	 * @return this depot's name
	 */

	public void setDepotname(int depotName) {
		this.depotName = depotName;
	}

	/**
	 * 
	 * This methods get Initial Cash
	 * 
	 * @return this Depots inicial cash
	 */

	public double getInitialCash() {
		return initialCash;
	}

	/**
	 * 
	 * This methods setInitial Cash
	 * 
	 * @return this Depots inicial cash
	 */

	public void setInitialCash(double initialCash) {
		this.initialCash = initialCash;
	}

	/**
	 * 
	 * This methods get product price
	 * 
	 * @return this product's price
	 */

	public double getProductPrice() {
		return productPrice;
	}

	/**
	 * 
	 * This methods seet product price
	 * 
	 * @return this product's price
	 */

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * 
	 * This methods get Delivery price
	 * 
	 * @return this Delivery's price
	 */

	public double getDeliveryPrice() {
		return deliveryPrice;
	}

	/**
	 * 
	 * This methods seet Delivery price
	 * 
	 * @return this DElivery's price
	 */

	public void setDeliveryPrice(double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	// Standard toString method for all depots
	@Override
	public String toString() {
		return "Depot: " + getDepotName() + ", Cash : " + getInitialCash() + ", Native Product: " + getNativeProduct()
				+ ", External Product B: " + getExternalproductB() + "External Product C: " + getExternalproductC();
	}

}
