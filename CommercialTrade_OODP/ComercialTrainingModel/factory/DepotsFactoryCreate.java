package factory;

import abstractFactory.DepotsAbstractFactory;
import depots.Depots;

/**
 * 
 * 
 * 
 * @author jeancastro
 *
 */

public class DepotsFactoryCreate {
	
	
	
	
	/**
	 * Constructor with attributes for the  Depots Factory Create
	 * 
	 * 
	 * @param factory      Depots's Factory
	 * @return this Factory Depots
	 */

    public static Depots getDepots(DepotsAbstractFactory factory){
    	
 
        return factory.createDepots();
    }
    
}