package company;

import java.util.Arrays;
import depots.Depots;
import factory.DepotSparFactory;
import factory.DepotsFactoryCreate;

/**
 * 
 * 
 * This is the Aldi Company object class that extends Company
 * 
 * 
 * @author jeancastro
 *
 */

public class CompanyBAldi extends Company {

	/**
	 * 
	 * Constructor with attributes for the Spar Company
	 * 
	 * @param companyname       Aldi Company name;
	 * 
	 * @param nativeproductname Aldi Native Product name;
	 */

	public CompanyBAldi(String companyname, String nativeproductname) {

		this.companyname = companyname;
		this.nativeproductname = nativeproductname;
		this.depotArray = gettingDepotArray();
	}

	/**
	 * 
	 * This methos is responsible to creat 50 depots for the Aldi Company
	 * 
	 * 
	 * @return this Aldi Company array
	 */

	public Depots[] gettingDepotArray() {

		Depots[] toReturn = new Depots[50];
		int depotID = 1;

		for (int i = 0; i < toReturn.length; i++) {

			Depots depotAldi = DepotsFactoryCreate.getDepots(new DepotSparFactory(depotID, 1.0, 1.0, 1.0, i, i, i));
			depotID++;

			toReturn[i] = depotAldi;

		}

		return toReturn;

	}

	// Standard toString method for all company
	@Override
	public String toString() {
		return "Company B Name: " + getCompanyname() + ",Native Product: " + getNativeproductname() + ", Depots="
				+ Arrays.toString(depotArray) + ",getDepotarray()=" + Arrays.toString(getDepotarray()) + "]";
	}

}
