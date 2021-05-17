package depots;

/**
 * 
 * 
 * This is the Spar Depots object class that extends Depots
 * 
 * 
 * @author jeancastro
 *
 */

public class DepotsSpar extends Depots {

	/**
	 * 
	 * 
	 * Constructor with attributes for the Spar Depots
	 * 
	 * @param depotName        Spar Depots depotname;
	 * 
	 * 
	 * @param initialCash      Spar depots initial cash;
	 * 
	 * @param productPrice     Spar depots Product Price;
	 * 
	 * @param deliveryPrice    Spar depots Delivery Price;
	 * 
	 * @param externalproductB Spar depots External Product B
	 * 
	 * @param externalproductC Spar depots External Product C
	 * 
	 * 
	 * @param nativeProduct    Spar depots native product
	 */

	public DepotsSpar(int depotName, double initialCash, double productPrice, double deliveryPrice,
			int externalproductB, int externalproductC, int nativeProduct) {

		this.depotName = depotName;
		this.initialCash = initialCash;
		this.productPrice = productPrice;
		this.deliveryPrice = deliveryPrice;
		this.nativeProduct = nativeProduct;
		this.externalproductB = externalproductB;
		this.externalproductC = externalproductC;

	}

	// Standard toString method for all depots
	@Override
	public String toString() {

		return "Depot: " + getDepotName() + ", Cash : " + getInitialCash() + ", Native Product: " + getNativeProduct()
				+ ", External Product B: " + getExternalproductB() + ", External Product C: " + getExternalproductC();
	}

}
