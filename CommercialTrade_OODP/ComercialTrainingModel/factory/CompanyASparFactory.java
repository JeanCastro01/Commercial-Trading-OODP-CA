package factory;

import abstractFactory.CompanyAbstractFactory;
import company.Company;
import company.CompanyASpar;

/**
 * 
 * This is the Spar Company Factory class that extends the Company Abstract
 * Factory class
 * 
 * @author jeancastro
 *
 */

public class CompanyASparFactory extends CompanyAbstractFactory {

	/**
	 * 
	 * Constructor with attributes for the Spar Company Factory
	 * 
	 * 
	 * 
	 * @param companyname       Spar's Company Name
	 * 
	 * @param nativeproductname Spar's Native Product name
	 */
	public CompanyASparFactory(String companyname, String nativeproductname) {
		super(companyname, nativeproductname);
	}

	/**
	 * ]
	 * 
	 * 
	 * This method returns the CompanySpar with the parameters 
	 */

	@Override
	public Company createCompany() {
		// TODO Auto-generated method stub
		return new CompanyASpar(companyname, nativeproductname);
	}
}
