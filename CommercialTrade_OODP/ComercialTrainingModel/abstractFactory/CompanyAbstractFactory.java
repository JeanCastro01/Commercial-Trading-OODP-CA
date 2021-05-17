package abstractFactory;

import company.Company;




/**
 * 
 * This class is the company's Abstract factory Class
 * 
 * 
 * @author jeancastro
 *
 */

public abstract class CompanyAbstractFactory {

	protected String companyname;
	protected String nativeproductname;
	
	
	
	
	
	/**
	 * 
	 * 
	 * Constructor with attributes for the Abstract Company's
	 * 
	 * @param companyname        Company's name
	 * 
	 * @param nativeproductname  Company's Native Product Name
	 */

	public CompanyAbstractFactory(String companyname, String nativeproductname) {

		this.companyname = companyname;
		this.nativeproductname = nativeproductname;

	}
	
	
	/**
	 * 
	 * This is the obstract Company class 
	 * 
	 * @return this creatCompany 
	 */

	public abstract Company createCompany();

}
