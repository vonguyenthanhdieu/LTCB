package House;

public class House {
	String kind;
	int numberOfRooms;
	double price;
	Address address;
	/**The "assistant'' helps the real estate agent locate houses of interest for clients.
	 *  The information about a house includes:
	 *  - Its kind
	 *  - The number_of_rooms,
	 *  - The asking price
	 *  - Its address. 
	 *  An address consists of a house number, a street name, and a city.
	 *   Examples:
	 * + Ranch, 7 rooms, $375,000, 23 Maple Street, Brookline
	 * + Colonial, 9 rooms, $450,000, 5 Joye Road, Newton
	 * + Cape, 6 rooms, $235,000, 83 Winslow Road, Waltham
	 */
	public House(String kind, int numberOfRooms, double price, Address address) {
		this.kind = kind;
		this.numberOfRooms = numberOfRooms;
		this.price = price;
		this.address = address;
	}
	/**which determines whether one house has more rooms than some other house;*/
	boolean hasMoreRooms(House that) {
		return this.numberOfRooms > that.numberOfRooms; 
	}
	/**which checks whether the advertised house is in some given city 
	(assume we give the method a city name)
	 */
	boolean inThisCity(String city) {
		return this.address.inThisCity(city);
	}
	/**which determines whether one house is in the same city as some other house.
	 */
	boolean sameCity(House that) {
		return this.address.sameCity(that.address);
	}
}

