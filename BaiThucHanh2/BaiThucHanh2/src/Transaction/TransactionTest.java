package Transaction;
import junit.framework.TestCase;
public class TransactionTest extends TestCase {
	public void testConstructor() {
		Transaction t1 = new Transaction("Thuy", 6000, 2);
		Transaction t2 = new Transaction("Mai", 2500, 1);
		Transaction t3 = new Transaction("Nam", 1500, 2);
		Transaction t4 = new Transaction("Tien", 500, 2);
	}
	public void testInterest(){
		Transaction t1 = new Transaction("Thuy", 6000, 2);
		Transaction t2 = new Transaction("Mai", 2500, 1);
		Transaction t3 = new Transaction("Nam", 1500, 2);
		Transaction t4 = new Transaction("Tien", 500, 2);
		assertEquals(300.0, t1.interest(1000, 5000, 0.04, 0.045, 0.05), 0.001);
		assertEquals(112.5, t2.interest(1000, 5000, 0.04, 0.045, 0.05), 0.001);
		assertEquals(67.5, t3.interest(1000, 5000, 0.04, 0.045, 0.05), 0.001);
		assertEquals(20.0, t4.interest(1000, 5000, 0.04, 0.045, 0.05), 0.001);
	}
	public void testPayback() {
		Transaction t1 = new Transaction("Thuy", 6000, 2);
		Transaction t2 = new Transaction("Mai", 2500, 1);
		Transaction t3 = new Transaction("Nam", 1500, 2);
		Transaction t4 = new Transaction("Tien", 500, 2);
		assertEquals(48.75, t1.payback(500, 1500, 2500, 0.0025, 0.005, 0.0075, 0.01), 0.001);
		assertEquals(13.75, t2.payback(500, 1500, 2500, 0.0025, 0.005, 0.0075, 0.01), 0.001);
		assertEquals(6.25, t3.payback(500, 1500, 2500, 0.0025, 0.005, 0.0075, 0.01), 0.001);
		assertEquals(1.25, t4.payback(500, 1500, 2500, 0.0025, 0.005, 0.0075, 0.01), 0.001);
	}
}