package products;


/**
 * 
 * 
 * This is the CocaCola object class that extends Products
 * 
 * 
 * @author jeancastro
 *
 */

public class CocaCola extends Products {
	
	
	
	/**
	 * 
	 * Constructor with attributes for the Coca Cola prodcut
	 * 
	 * @param name      Coca Cola's name
	 * @param quantity  Coca Cola's quantity
	 * @param price     Coca Cola's price
	 */

	
	public CocaCola(String name, int quantity , double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	  /**
	    * 
	    * 
	    * Specific implementation for Coca Cola
	    */
    @Override
    public String toString() {
    	
    	
    	 return "Product Name: " + getName() + ", Price: " + getPrice() +  ", Quantity: " + getQuantity();

    }

}
