package House;

import junit.framework.TestCase;
public class HouseTest extends TestCase{
	public void testConstructor() {
		House h1= new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brookline"));
		House h2= new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
		House h3= new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Waltham"));
	}
	public void hasMoreRooms() {
		House h1= new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brookline"));
		House h2= new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
		House h3= new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Waltham"));
		assertFalse( h1.hasMoreRooms(h2));
		assertTrue(h2.hasMoreRooms(h3));
	}
	public void inThisCity() {
		House h1= new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brookline"));
		House h2= new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
		House h3= new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Waltham"));
		assertTrue(h1.inThisCity("Brooklyn"));
		assertFalse(h3.inThisCity("Newton"));
	}
	public void sameCity() {
		House h1= new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brookline"));
		House h2= new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
		House h3= new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Waltham"));
		assertTrue(h1.sameCity(h1));
		assertFalse(h2.sameCity(h3));
	}
}