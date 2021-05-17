package company;

import depots.Depots;

/**
 * 
 * This class is for the Company object
 * 
 * 
 * @author jeancastro
 *
 */

public abstract class Company {

	protected String companyname;
	protected String nativeproductname;
	protected Depots[] depotArray = new Depots[50];

	/**
	 * 
	 * This methods get Depots Array
	 * 
	 * @return this 'Depot's Array
	 */

	public void setDepotArray(Depots[] depotArray) {
		this.depotArray = depotArray;
	}

	/**
	 * 
	 * This methods set Depots Array
	 * 
	 * @return this 'Depot's Array
	 */

	public Depots[] getDepotarray() {
		return depotArray;
	}

	/**
	 * 
	 * This methods get Company name
	 * 
	 * @return this Company's name
	 */

	public String getCompanyname() {
		return companyname;
	}

	/**
	 * 
	 * This methods set Company Name
	 * 
	 * @return this Company's name
	 */

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	/**
	 * 
	 * This methods get Native Product name
	 * 
	 * @return this Native Product's name
	 */

	public String getNativeproductname() {
		return nativeproductname;
	}

	/**
	 * 
	 * This methods seet native product name
	 * 
	 * @return this native's products name
	 */
	public void setNativeproductname(String nativeproductname) {
		this.nativeproductname = nativeproductname;
	}

	// Standard toString method for all company
	@Override
	public String toString() {
		return "Company Name : " + getCompanyname() + ", Native Product: " + getNativeproductname();
	}

}
