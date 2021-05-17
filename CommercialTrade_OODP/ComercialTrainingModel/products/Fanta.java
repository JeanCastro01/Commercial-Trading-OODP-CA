package products;




/**
 * 
 * This is the fanta object class which extends Products 
 * 
 * @author jeancastro
 *
 */

public class Fanta extends Products {
	
	
	
	
/**
 * 
 * Constructor with attributes for the Fanta prodcut
 * 
 * @param name      Fanta's name
 * @param quantity  Fanta's quantity
 * @param price     Fanta's price
 */
	public Fanta(String name, int quantity , double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	
   /**
    * 
    * 
    * Specific implementation for Fanta
    */
    @Override
    public String toString() {
    	 return "Product Name: " + getName() + ", Price:" + getPrice() +  ", Quantity: " + getQuantity();

    }

}
