package House;

public class Address {
	int houseNumber;
	String streetName;
	String city;
	/**An address consists of:
	 * - a house number
	 * - a street name
	 * - a city.
	 * Examples:
	 * + Ranch, 7 rooms, $375,000, 23 Maple Street, Brookline
	 * + Colonial, 9 rooms, $450,000, 5 Joye Road, Newton
	 * + Cape, 6 rooms, $235,000, 83 Winslow Road, Waltham*/
	public Address(int houseNumber, String streetName, String city) {
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
	}
	/**which checks whether the advertised house is in some given city 
	(assume we give the method a city name)
	 */
	boolean inThisCity(String thatCity) {
		return this.city.equals(thatCity);
	}
	/**which determines whether one house is in the same city as some other house.
	 */
	boolean sameCity(Address that) {
		return this.city.equals(that.city);
	}
}
