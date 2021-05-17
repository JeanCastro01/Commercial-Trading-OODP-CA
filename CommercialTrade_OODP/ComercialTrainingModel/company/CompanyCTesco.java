Compackage company;

import java.util.Arrays;
import depots.Depots;
import factory.DepotSparFactory;
import factory.DepotsFactoryCreate;

/**
 * 
 * 
 * This is the Tesco Company object class that extends Company
 * 
 * 
 * @author jeancastro
 *
 */
public class CompanyCTesco extends Company {

	/**
	 * 
	 * Constructor with attributes for the Tesco Company
	 * 
	 * @param companyname       Tesco Company name;
	 * @param nativeproductname Tesco Native Product name;
	 */

	public CompanyCTesco(String companyname, String nativeproductname) {

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

			Depots depotTesco = DepotsFactoryCreate.getDepots(new DepotSparFactory(depotID, 1.0, 1.0, 1.0, i, i, i));
			depotID++;

			toReturn[i] = depotTesco;

		}

		return toReturn;

	}

	// Standard toString method for all company
	@Override
	public String toString() {
		return "Native Product: " + getNativeproductname() + " Company C Name: " + getCompanyname() + "\n"
				+ Arrays.toString(depotArray) + ",getDepotarray()=" + Arrays.toString(getDepotarray()) + "]";
	}

}
