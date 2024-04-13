package Train;

public class Schedule {
	private ClockTime leave;
	private ClockTime arrive;
	/**
	 * @param leave
	 * @param arrive
	 * Example:
	 * ClockTime ct1 = new ClockTime(5, 17);
	 * ClockTime ct2 = new ClockTime(21, 30);
	 * ClockTime ct3 = new ClockTime(1, 20);
	 * 
	 * Schedule s1 = new Schedule(ct1, ct2);
	 * Schedule s2 = new Schedule(ct2, ct3);
	 */
	public Schedule(ClockTime leave, ClockTime arrive) {
		this.leave = leave;
		this.arrive = arrive;
	}
	/**
	 * @return the departure
	 */
	public ClockTime startTime(){
		return leave;
	}
	/**
	 * @param departure the departure to set
	 */
	public void setDeparture(ClockTime leave) {
		this.leave = leave;
	}
	/**
	 * @return the arrive
	 */
	public ClockTime getArrive() {
		return arrive;
	}
	/**
	 * @param arrive the arrive to set
	 */
	public void setArrive(ClockTime arrive) {
		this.arrive = arrive;
	}
	
	/**
	 * How long does the train trip take?
	 * 
	 * ClockTime ct1 = new ClockTime(5, 17);
	 * ClockTime ct2 = new ClockTime(21, 30);
	 * ClockTime ct3 = new ClockTime(1, 20);
	 * 
	 * Schedule s1 = new Schedule(ct1, ct2);
	 * Schedule s2 = new Schedule(ct2, ct3);
	 * 
	 * s1.sub() -> ClockTime(16, 13);
	 * s2.sub() -> ClockTime(3, 50);
	 * @return
	 */
	public ClockTime howLong() {
		// TODO Auto-generated method stub
		return this.arrive.sub(this.leave);
	}
	
}
