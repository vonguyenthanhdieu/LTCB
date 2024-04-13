package JetFuel;

public class JetFuel {
	int quantitySold;
	String qualityLevel;
	int basePrice;
	public JetFuel(int quantitySold, String qualityLevel, int basePrice) {
		this.quantitySold = quantitySold;
		this.qualityLevel = qualityLevel;
		this.basePrice = basePrice;
	}
	/*which computes the cost of the sale*/
	int totalCost() {
		return this.quantitySold * this.basePrice ;
	}
	/*which computes the discounted price.
	 * The buyer gets a 10% discount if the sale is for more than 100,000 gallons*/
	double discountPrice(double discount, int quatity) {
		if (this.quantitySold > quatity )
			return this.totalCost()* discount;
			else return 0.0;
	}
}

