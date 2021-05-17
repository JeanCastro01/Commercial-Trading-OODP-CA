package factory;

import abstractFactory.CompanyAbstractFactory;
import company.Company;
import company.CompanyCTesco;

/**
 * 
 * This is the Tesco Company Factory class that extends the Company Abstract
 * Factory class
 * 
 * @author jeancastro
 *
 */

public class CompanyCTescoFactory extends CompanyAbstractFactory {

	/**
	 * 
	 * Constructor with attributes for the Tesco Company Factory
	 * 
	 * 
	 * 
	 * @param companyname       Tesco's Company Name
	 * 
	 * @param nativeproductname Tesco's Native Product name
	 */

	public CompanyCTescoFactory(String companyname, String nativeproductname) {
		super(companyname, nativeproductname);
	}

	/**
	 * 
	 * 
	 * 
	 * This method returns the CompanyTesco with the parameters
	 */

	@Override
	public Company createCompany() {
		// TODO Auto-generated method stub
		return new CompanyCTesco(companyname, nativeproductname);
	}
}
