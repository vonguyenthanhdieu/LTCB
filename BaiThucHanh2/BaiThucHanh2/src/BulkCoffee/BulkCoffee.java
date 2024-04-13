package BulkCoffee;

public class BulkCoffee {
	String kind;
	double unitPrice;
	double weight;
	public BulkCoffee(String kind, double unitPrice, double weight) {
		this.kind = kind;
		this.unitPrice = unitPrice;
		this.weight = weight;
	}
	/*the cost of selling bulkcoffee at a specialty coffee seller from areceipt that 
	 * includes the kind of coffee, the unit price, and the total amount (weight) sold. 
	 * If the sale is for less than 5,000 pounds, there is no discount. 
	 * For sales of 5,000 pounds to 20,000 pounds, the seller grants a discount of 10%. 
	 * For sales of 20,000 pounds or more, the discount is 25%.*/
	double costOfSelling(double sale1, double sale2, double discount1, double discount2, double discount3) {
		double sale = this.unitPrice * this.weight;
		if (sale < sale1) 
			return sale = sale - sale*discount1;
		if (sale < sale2)
			return sale = sale - sale*discount2;
		return sale = sale - sale* discount3;
	}
}
