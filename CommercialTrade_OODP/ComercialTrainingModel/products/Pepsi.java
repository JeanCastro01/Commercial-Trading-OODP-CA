topackage products;

/**
 * 
 * This is the Pepsi object class that extends Products
 * 
 * @author jeancastro
 *
 */

public class Pepsi extends Products {
	
	
	/**
	 * 
	 * Constructor with attributes for the Pepsi
	 * 
	 * 
	 * @param name     Pepsi's name
	 * @param quantity Pepsi's Quantity 
	 * @param price    Pepsi's price
	 */

	public Pepsi(String name, int quantity , double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	
    // Specific implementation for Pepsi
    @Override
    public String toString() {
    	 return "Product Name: " + getName() + ", Price:" + getPrice() +  ", Quantity: " + getQuantity();

    }

}