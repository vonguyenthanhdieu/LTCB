package JetFuel;

import junit.framework.TestCase;
public class JetFuelTest extends TestCase {
	public void testConstructor() {
		JetFuel j1 = new JetFuel(35000, "high", 5);
		JetFuel j2 = new JetFuel( 100, "low", 101000);
	}
	public void totalCost() {
		JetFuel j1 = new JetFuel(35000, "high", 5);
		JetFuel j2 = new JetFuel( 100, "low", 101000);
		assertEquals(j1.totalCost(), 175000);
		assertEquals(j2.totalCost(), 10100000);
	}
	public void discountPrice(double discount, int quatity) {
		JetFuel j1 = new JetFuel(35000, "high", 5);
		JetFuel j2 = new JetFuel( 100, "low", 101000);
		assertEquals(j1.discountPrice(0.1, 100000), 1010000.0, 0.001);
		assertEquals(j2.discountPrice(0.1, 100000), 0.0, 0.001);
	}
}