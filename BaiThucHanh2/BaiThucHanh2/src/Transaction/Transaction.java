package Transaction;

public class Transaction {
	String customerName;
	double depositeAmount;
	int maturity;
	public Transaction(String customerName, double depositeAmount, int maturity) {
		this.customerName = customerName;
		this.depositeAmount = depositeAmount;
		this. maturity = maturity;
	}
	/*
	 * It consumes a deposit amount and produces the actual amount of interest that the money earns in a year.
	 *  The bank pays a flat 4% per year for deposits of up to $1,000,
	 *   a flat 4.5% for deposits of up to $5,000, and a flat 5% for deposits of more than $5,000*/
	double interest(int deposite1, int deposite2, double t1, double t2, double t3) {
		if (this.depositeAmount <= deposite1)
			return this.depositeAmount * t1;
		if (this.depositeAmount <= deposite2)
			return this.depositeAmount * t2 ;
		return this.depositeAmount * t3 ;
	}
	/*which consumes a charge amount and computes the corresponding pay-back amount.*/
	double payback(int deposite1, int deposite2, int deposite3, double t1, double t2, double t3, double t4) {
		if (this.depositeAmount <= deposite1)
			return this.depositeAmount * t1;
		if (this.depositeAmount <= deposite2)
			return deposite1 * t1 + (this.depositeAmount - deposite1)* t2 ;
		if (this.depositeAmount <= deposite3 )
			return deposite1 * t1 + (deposite2 - deposite1) * t2 + (this.depositeAmount -deposite2)* t3;
		return deposite1 * t1 + (deposite2 - deposite1) * t2 + (deposite3 - deposite2) * t3 
				+ (this.depositeAmount - deposite3)* t4;
		}
}
