package factory;

import abstractFactory.CompanyAbstractFactory;
import company.Company;
import company.CompanyBAldi;

/**
 * 
 * This is the ALdi Company Factory class that extends the Company Abstract
 * Factory class
 * 
 * @author jeancastro
 *
 */

public class CompanyBAldiFactory extends CompanyAbstractFactory {

	/**
	 * 
	 * Constructor with attributes for the Aldi Company Factory
	 * 
	 * 
	 * 
	 * @param companyname       Aldi's Company Name
	 * 
	 * @param nativeproductname Aldi's Native Product name
	 */

	public CompanyBAldiFactory(String companyname, String nativeproductname) {
		super(companyname, nativeproductname);
	}

	/**
	 * 
	 * 
	 * 
	 * This method returns the CompanyAldi with the parameters
	 */

	@Override
	public Company createCompany() {
		// TODO Auto-generated method stub
		return new CompanyBAldi(companyname, nativeproductname);
	}
}
