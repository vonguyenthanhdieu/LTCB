package Train;

public class Train {
	private Schedule schedule;
	private Route route;
	private boolean isLocal;
	/**A program that can assist railway travelers with the arrangement of train trips.
	 * The available information about a specific train includes its 
	 * - schedule, 
	 * - its route, 
	 * - and whether it is local.
	 * The route information consists of the origin and the destination station.
	 * A schedule specifies the departure and the arrival (clock) times 
	 * when the train leaves and when it arrives.
	 * ClockTime consists of the hour (of the day) and the minutes (of the hour).
	 * Example:
	 * ClockTime ct1 = new ClockTime(5, 17);
	 * ClockTime ct2 = new ClockTime(21, 30);
	 * ClockTime ct3 = new ClockTime(1, 20);
	 * 
	 * Schedule s1 = new Schedule(ct1, ct2);
	 * Schedule s2 = new Schedule(ct2, ct3);
	 * 
	 * Route r1 = new Route("Thu Duc", "Ben Thanh");
	 * Route r2 = new Route("Thu Duc", "Cho Lon");
	 * 
	 * Train t1 = new Train(s1, r1, false);
	 * Train t2 = new Train(s2, r2, true); 
	 */
	public Train(Schedule schedule, Route route, boolean isLocal) {
		this.schedule = schedule;
		this.route = route;
		this.isLocal = isLocal;
	}
	/**
	 * Does his destination station match the destination of the train trip?
	 * 
	 * Route r1 = new Route("Thu Duc", "Ben Thanh");
	 * Route r2 = new Route("Thu Duc", "Cho Lon");
	 * 
	 * r1.matchDestination("Thu Duc") -> false;
	 * r2.matchDestination("Cho Lon") -> true;
	 * @param destination
	 * @return
	 */
	public boolean matchDestination(String destination) {
		return this.route.matchDestination(destination);
	}
	/**
	 * What time does the train start ?
	 * 
	 * ClockTime ct1 = new ClockTime(5, 17);
	 * ClockTime ct2 = new ClockTime(21, 30);
	 * ClockTime ct3 = new ClockTime(1, 20);
	 * 
	 * Schedule s1 = new Schedule(ct1, ct2);
	 * Schedule s2 = new Schedule(ct2, ct3);
	 * 
	 * s1.startTime() -> ClockTime(5, 17);
	 * s2.StartTime() -> ClockTime(21, 30);
	 * @return
	 */
	public ClockTime startTime() {
		return this.schedule.startTime();
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
		return this.schedule.howLong();
	}
}
