package Train;

import junit.framework.TestCase;
public class TrainTest extends TestCase {
	public void testContructor(){
		 ClockTime ct1 = new ClockTime(5, 17);
		 ClockTime ct2 = new ClockTime(21, 30);
		 ClockTime ct3 = new ClockTime(1, 20);
		  
		 Schedule s1 = new Schedule(ct1, ct2);
		 Schedule s2 = new Schedule(ct2, ct3);
		  
		 Route r1 = new Route ("Thu Duc", "Ben Thanh");
		 Route r2 = new Route ("Thu Duc", "Cho Lon");
		  
		 Train t1 = new Train (s1, r1, false);
		 Train t2 = new Train (s2, r2, true);
	}
	public void testMatchDestination(){
		ClockTime ct1 = new ClockTime(5, 17);
		 ClockTime ct2 = new ClockTime(21, 30);
		 ClockTime ct3 = new ClockTime(1, 20);
		  
		 Schedule s1 = new Schedule(ct1, ct2);
		 Schedule s2 = new Schedule(ct2, ct3);
		  
		 Route r1 = new Route ("Thu Duc", "Ben Thanh");
		 Route r2 = new Route ("Thu Duc", "Cho Lon");
		  
		 Train t1 = new Train (s1, r1, false);
		 Train t2 = new Train (s2, r2, true);
		 
		 assertFalse(t1.matchDestination("Thu Duc"));
		 assertTrue(t2.matchDestination("Cho Lon"));
		 
	}
	public void testStartTime(){
		 ClockTime ct1 = new ClockTime(5, 17);
		 ClockTime ct2 = new ClockTime(21, 30);
		 ClockTime ct3 = new ClockTime(1, 20);
		  
		 Schedule s1 = new Schedule(ct1, ct2);
		 Schedule s2 = new Schedule(ct2, ct3);
		  
		 Route r1 = new Route ("Thu Duc", "Ben Thanh");
		 Route r2 = new Route ("Thu Duc", "Cho Lon");
		  
		 Train t1 = new Train (s1, r1, false);
		 Train t2 = new Train (s2, r2, true);
		 
		 assertEquals(t1.startTime() ,new ClockTime(5, 17));
		 assertEquals(t2.startTime() ,new ClockTime(21, 30));
	}
	public void testHowLong(){
		 ClockTime ct1 = new ClockTime(5, 17);
		 ClockTime ct2 = new ClockTime(21, 30);
		 ClockTime ct3 = new ClockTime(1, 20);
		  
		 Schedule s1 = new Schedule(ct1, ct2);
		 Schedule s2 = new Schedule(ct2, ct3);
		  
		 Route r1 = new Route ("Thu Duc", "Ben Thanh");
		 Route r2 = new Route ("Thu Duc", "Cho Lon");
		  
		 Train t1 = new Train (s1, r1, false);
		 Train t2 = new Train (s2, r2, true);
		 assertEquals(t1.howLong(), new ClockTime(16, 13));
		 assertEquals(t2.howLong(), new ClockTime(3, 50));
	}
}

