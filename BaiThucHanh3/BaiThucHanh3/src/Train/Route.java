package Train;

public class Route {
	private String origin;
	private String destination;
	/** The route information consists of the origin and the destination station.
	 * Route r1 = new Route("Thu Duc", "Ben Thanh");
	 * Route r2 = new Route("Thu Duc", "Cho Lon");
	 * @param origin
	 * @param destination
	 */
	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}
	/**
	 * Does his destination station match the destination of the train trip?
	 * 
	 * @param destination
	 * @return
	 */
	 public boolean matchDestination(String that) {
		return this.destination.equals(that);
	}
}
