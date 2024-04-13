package BulkCoffee;

import junit.framework.TestCase;
public class BulkCoffeeTest extends TestCase {
	public void testConstructor() {
		BulkCoffee c1 = new BulkCoffee("ca phe bo", 145000.0, 0.3);
		BulkCoffee c2 = new BulkCoffee("ca phe chon", 589000.0, 2.0);
	}
	public void costOfSelling(double sale1, double sale2, double discount1, double discount2, double discount3) {
		BulkCoffee c1 = new BulkCoffee("ca phe bo", 145000.0, 0.3);
		BulkCoffee c2 = new BulkCoffee("ca phe chon", 589000.0, 2.0);
		assertEquals(c1.costOfSelling(5000, 20000, 0.0, 0.1, 0.25), 43.5, 0.001);
		assertEquals(c2.costOfSelling(5000, 20000, 0.0, 0.1, 0.25), 883.5);
	}
}