package depots;


/**
 * 
 * 
 * This is the Aldi Depots object class that extends Depots
 * 
 * 
 * @author jeancastro
 *
 */


public class DepotsAldi extends Depots{
	
	
	/**
	 * 
	 * 
	 * Constructor with attributes for the Aldi Depots 
	 * 
	 * @param depotName          Aldi Depots depotname;
	 * 
	 * 
	 * @param initialCash        Aldi depots initial cash;
	 * 
	 * @param productPrice       Aldi depots Product Price;
	 * 
	 * @param deliveryPrice      Aldi depots Delivery Price;
	 * 
	 * @param externalproductB   Aldi depots External Product B
	 * 
	 * @param externalproductC  Aldi depots External Product C
	 * 
	 * 
	 * @param nativeProduct    Aldi depots native product 
	 */
	

	public DepotsAldi(int depotName, double initialCash , double productPrice , double deliveryPrice , int externalproductB , int externalproductC , int nativeProduct) {
		
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
    	
    	
         return "Depot: " + getDepotName() + ", Cash : " + getInitialCash() + ", Native Product: "+ getNativeProduct()+ ", External Product B: " + getExternalproductB() + "External Product C: " + getExternalproductC() ; 
    }

}

