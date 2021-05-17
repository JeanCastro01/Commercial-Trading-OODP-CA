package factory;

import abstractFactory.CompanyAbstractFactory;
import company.Company;


/**
 * 
 * 
 * 
 * 
 * @author jeancastro
 *
 */



public class CompanyFactoryCreate {
	
	/**
	 * Constructor with attributes for the  Company Factory Create
	 * 
	 * 
	 * @param factory      Company's Factory
	 * @return this Factory Company's
	 */

    public static Company getCompany(CompanyAbstractFactory factory){
        return factory.createCompany();
    }
    
}