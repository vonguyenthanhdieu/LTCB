package House;
/*
 * The "assistant'' helps the real estate agent locate
houses of interest for clients. 
The information about a
house includes its kind, the number of rooms, the
asking price, and its address. An address consists of a
house number, a street name, and a city.
Ranch: A ranch is a large farm used for raising
animals, especially cattle, horses or sheep.

Colonial: A colonial building or piece of furniture
was built or made in a style that was popular in
American in the 17th and 18th centuries.

Cape: A cape is a large piece of land that sticks out
into the sea from the coast.*/
public class House {
	String kind;
	int numberOfRooms;
	int askingPrice;
	Address address;
	public House(String kind, int numberOfRooms, int askingPrice, Address address) {
		this.kind = kind;
		this.numberOfRooms = numberOfRooms;
		this.askingPrice = askingPrice;
		this.address = address;
	}
}
