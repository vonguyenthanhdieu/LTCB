package Employee;

import junit.framework.TestCase;
public class EmployeeTest extends TestCase {
	public void testConstructor() {
		Employee employee1 = new Employee("Mai", 30);
		Employee employee2 = new Employee("Minh", 102);
		Employee employee3 = new Employee("Nam", 20);
	}
	public void testgetWage() {
		assertEquals( new Employee("Nam", 20).getWage(12.0), 240.0, 0.001);
		Employee employee1 = new Employee("Mai", 30);
		Employee employee2 = new Employee("Minh", 102);
		assertEquals(employee1.getWage(12.0), 360.0, 0.001);
		assertEquals(employee2.getWage(12.0), 1224.0, 0.001);
	}
	public void testgetTax() {
		assertEquals(new Employee("Nam", 40).getTax(0.15, 12.0),72.0, 0.001);
		Employee employee1 = new Employee("Mai", 30);
		Employee employee2 = new Employee("Minh", 102);
		assertEquals(employee1.getTax(0.15, 12.0), 54.0, 0.001);
		assertEquals(employee2.getTax(0.15, 12.0), 183.6, 0.001);
	}
	public void testgetNetPay() {
		assertEquals(new Employee("Nam", 40).getNetPay(12.0, 0.15),408.0, 0.001);
		Employee employee1 = new Employee("Mai", 30);
		Employee employee2 = new Employee("Minh", 102);
		assertEquals(employee1.getNetPay(12.0, 0.15), 306.0, 0.01);
		assertEquals(employee2.getNetPay(12.0, 0.15), 1040.4, 0.01);
	}
	public void testgetRaiseWage() {
		assertEquals(new Employee("Nam", 20).getRaiseWage(14.0, 12.0),254.0, 0.001);
		Employee employee1 = new Employee("Mai", 30);
		Employee employee2 = new Employee("Minh", 102);
		assertEquals(employee1.getRaiseWage(14.0, 12.0), 374.0, 0.001);
		assertEquals(employee2.getRaiseWage(14.0, 12.0), 1238.0, 0.001);
	}
	public void testcheckOverTime() {
		assertFalse(new Employee("Nam", 40).checkOverTime(100));
		Employee employee1 = new Employee("Mai", 30);
		Employee employee2 = new Employee("Minh", 102);
		assertFalse(employee1.checkOverTime(100));
		assertTrue(employee2.checkOverTime(100));
	}
	public void testtaxWithRate() {
		assertEquals(new Employee("Nam", 20).taxWithRate(240.0, 480.0, 12.0), 0.0, 0.001);
		Employee employee1 = new Employee("Mai", 30);
		Employee employee2 = new Employee("Minh", 102);
		assertEquals(employee1.taxWithRate(240.0, 480.0, 12.0), 54.0, 0.001);
		assertEquals(employee2.taxWithRate(240.0, 480.0, 12.0), 342.72, 0.001);
	}
}