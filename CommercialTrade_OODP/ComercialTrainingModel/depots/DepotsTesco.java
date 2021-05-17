package depots;




/**
 * 
 * 
 * This is the Tesco Depots object class that extends Depots
 * 
 * 
 * @author jeancastro
 *
 */

public class DepotsTesco extends Depots {
	
	
	
	/**
	 * 
	 * 
	 * Constructor with attributes for the Tesco Depots 
	 * 
	 * @param depotName          Tesco Depots depotname;
	 * 
	 * 
	 * @param initialCash        Tesco depots initial cash;
	 * 
	 * @param productPrice       Tesco depots Product Price;
	 * 
	 * @param deliveryPrice      Tesco depots Delivery Price;
	 * 
	 * @param externalproductB   Tesco depots External Product B
	 * 
	 * @param externalproductC  Tesco depots External Product C
	 * 
	 * 
	 * @param nativeProduct    Tesco depots native product 
	 */
	


	public DepotsTesco(int depotName, double initialCash , double productPrice , double deliveryPrice , int externalproductB , int externalproductC , int nativeProduct) {
		
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
    public String toString()  {
    	
    	
        return   "Depot: " + getDepotName() + 
        		 ", Cash : " + getInitialCash() + 
        		 ", Product Price: " + getProductPrice() +
                 ", Delivery Price:" + getDeliveryPrice() +
                 ", Native Product: " +  getNativeProduct() +
                 ", External Product B: " + getExternalproductB() + 
                 ", External Product C: " + getExternalproductC(); 
    }

}
