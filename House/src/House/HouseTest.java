package House;

import junit.framework.TestCase;
public class HouseTest extends TestCase{
	public void testConstructor() {
		new House("Ranch",7,375000, new Address(23, "Maple Street", "Brookline"));
		new House("Colonial",9,450000, new Address(5, "Joye Road", "Newton"));
		new House("Cape",6,235000, new Address(83,"Winslow Road", "Waltham"));
	}
}