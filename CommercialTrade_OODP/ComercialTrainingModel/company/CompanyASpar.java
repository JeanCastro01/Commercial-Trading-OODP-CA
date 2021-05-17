
package company;

import java.util.Arrays;
import depots.Depots;
import factory.DepotSparFactory;
import factory.DepotsFactoryCreate;

/**
 * 
 * 
 * This is the Spar Company object class that extends Company
 * 
 * 
 * @author jeancastro
 *
 */

public class CompanyASpar extends Company {

	/**
	 * 
	 * Constructor with attributes for the Spar Company
	 * 
	 * @param companyname       Spar Company name;
	 * 
	 * @param nativeproductname Spar Native Product name;
	 */

	public CompanyASpar(String companyname, String nativeproductname) {

		this.companyname = companyname;
		this.nativeproductname = nativeproductname;

		this.depotArray = gettingDepotArray();
	}

	/**
	 * 
	 * This methos is responsible to creat 50 depots for the Spar Company
	 * 
	 * 
	 * @return this Spar Company array
	 */

	public Depots[] gettingDepotArray() {

		Depots[] toReturn = new Depots[50];
		int depotID = 1;

		for (int i = 0; i < toReturn.length; i++) {

			Depots depotSpar = DepotsFactoryCreate.getDepots(new DepotSparFactory(depotID, 1.0, 1.0, 1.0, i, i, i));
			depotID++;

			toReturn[i] = depotSpar;

		}

		return toReturn;

	}

	/**
	 * 
	 * Standard toString method for Spar Company
	 */

	@Override
	public String toString() {
		return "Native Product: " + getNativeproductname() + ", Depots=" + Arrays.toString(depotArray);
	}

}
