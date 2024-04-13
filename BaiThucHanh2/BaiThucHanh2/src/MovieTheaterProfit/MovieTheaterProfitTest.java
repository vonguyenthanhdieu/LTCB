package MovieTheaterProfit;

import junit.framework.TestCase;
public class MovieTheaterProfitTest extends TestCase {
	public void testConstructor() {
		MovieTheaterProfit m1 = new MovieTheaterProfit(5.0, 20.0, 0.15);
		MovieTheaterProfit m2 = new MovieTheaterProfit(6.0, 40.0, 0.1);
		MovieTheaterProfit m3 = new MovieTheaterProfit(7.0, 50.0, 0.2);
	}
	public void totalProfit(int numberAttendees) {
		MovieTheaterProfit m1 = new MovieTheaterProfit(5.0, 20.0, 0.15);
		assertEquals(m1.totalProfit(100), 465.0, 0.001);
		MovieTheaterProfit m2 = new MovieTheaterProfit(6.0, 40.0, 0.1);
		assertEquals(m2.totalProfit(100), 550.0, 0.001);
		MovieTheaterProfit m3 = new MovieTheaterProfit(7.0, 50.0, 0.2);
		assertEquals(m3.totalProfit(100), 630.0, 0.001);
	}
}