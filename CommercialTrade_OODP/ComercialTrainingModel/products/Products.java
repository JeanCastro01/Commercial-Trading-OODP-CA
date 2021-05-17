package products;

/**
 * 
 * This class is for the Products object
 * 
 * 
 * @author jeancastro
 *
 */


public abstract class Products {


	
	    
	    protected String name;
	    protected int quantity;
	    protected double price;
	 
	    
	    
	    /**
	     * 
	     * This methods get product price
	     * 
	     * @return this product's price
	     */
	    
		public double getPrice() {
			return price;
		}
		
		  /**
	     * 
	     * This methods set prodct price
	     * 
	     * @return this product's price
	     */
		public void setPrice(double price) {
			this.price = price;
		}
		  /**
	     * 
	     * This methods get product name
	     * 
	     * @return this product's name
	     */
		
		public String getName() {
			return name;
		}
		  /**
	     * 
	     * This methods set product name
	     * 
	     * @return this product's name
	     */
		
		public void setName(String name) {
			this.name = name;
		}
		  /**
	     * 
	     * This methods get prodcut quantity
	     * 
	     * @return this product's quantity
	     */
		
		public int getQuantity() {
			return quantity;
		}
		
		  /**
	     * 
	     * This methods set product quantity
	     * 
	     * @return this produtc's quantity
	     */
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		

		  // Standard toString method for all products
	    @Override
	    public String toString() {
	        return "Name: " + getName() + ", Price: " + getPrice() +  ", Quantity: " + getQuantity();
	    }

	}

