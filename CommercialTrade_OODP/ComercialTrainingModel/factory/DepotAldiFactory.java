package factory;

import java.util.Random;
import abstractFactory.DepotsAbstractFactory;
import depots.Depots;
import depots.DepotsAldi;

/**
 * 
 * This is the Aldi Depot Factory class that extends the Depots Abstract Factory
 * class
 * 
 * @author jeancastro
 *
 */

public class DepotAldiFactory extends DepotsAbstractFactory {

	/**
	 * 
	 * Constructor with attributes for the Aldi Depot Factory
	 * 
	 * 
	 * @param depotname        Aldi's Depot Name
	 * 
	 * @param initialcash      Aldi's Depot Initial Cash
	 * 
	 * @param productprice     Aldi's Depot Product Price
	 * 
	 * @param deliveryprice    Aldi's Depot Delivery Price
	 * 
	 * @param externalproductB Aldi's Depot External product B
	 * 
	 * @param externalproductC Aldi's Depot External Product C
	 * 
	 * @param nativeProduct    Aldi's Depot Native Product
	 */

	public DepotAldiFactory(int depotname, double initialcash, double productprice, double deliveryprice,
			int externalproductB, int externalproductC, int nativeProduct) {
		super(depotname, initialcash, productprice, deliveryprice, externalproductB, externalproductC, nativeProduct);
	}

	/**
	 * 
	 * This class is responsible to set
	 * 
	 * depotname, initialcash, productprice, deliveryprice, externalproductB,
	 * externalproductC, nativeProduct as a Random numbers.
	 * 
	 * 
	 * Returs new Aldi Depots object with the random parameters created.
	 * 
	 */

	@Override
	public Depots createDepots() {

		// https://www.baeldung.com/java-generating-random-numbers-in-range

		Random objGenerator = new Random();

		for (int iCount = 0; iCount < 1; iCount++) {
			initialcash = objGenerator.nextInt(100 - 50) + 50;

		}

		Random objGenerator2 = new Random();
		for (int iCount2 = 0; iCount2 < 1; iCount2++) {
			productprice = objGenerator2.nextInt(10 - 1) + 1;

		}

		Random objGenerator3 = new Random();
		for (int iCount3 = 0; iCount3 < 1; iCount3++) {
			deliveryprice = objGenerator3.nextInt(10 - 1) + 1;

		}

		Random objGenerator4 = new Random();

		for (int iCount4 = 0; iCount4 < 1; iCount4++) {
			depotname = objGenerator4.nextInt(50 - 1) + 1;

		}

		Random objGenerator5 = new Random();

		for (int iCount5 = 0; iCount5 < 1; iCount5++) {
			externalproductB = objGenerator5.nextInt(40 - 3) + 3;

		}

		Random objGenerator6 = new Random();

		for (int iCount6 = 0; iCount6 < 1; iCount6++) {
			externalproductC = objGenerator6.nextInt(40 - 3) + 3;

		}

		Random objGenerator7 = new Random();

		for (int iCount7 = 0; iCount7 < 1; iCount7++) {
			nativeProduct = objGenerator7.nextInt(50 - 15) + 15;

		}

		// TODO Auto-generated method stub
		return new DepotsAldi(depotname, initialcash, productprice, deliveryprice, externalproductB, externalproductC,
				nativeProduct);
	}

}