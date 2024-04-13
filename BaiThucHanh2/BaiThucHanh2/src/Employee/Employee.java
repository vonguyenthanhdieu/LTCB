package Employee;

public class Employee {
	String name;
	int numberOfHours;
	public Employee(String name, int numberOfHours) {
		this.name = name;
		this.numberOfHours = numberOfHours;
	}
	/*Determines the wage of an employee
	 * from the number of hours of work*/
	double getWage(double wage) {
		return this.numberOfHours * wage;
	}
	/*Determines the tax of an employee from the wage*/
	double getTax(double tax, double wage) {
		return this.getWage(wage) * tax;
	}
	/*Determines the net pay of an employee*/
	double getNetPay(double wage, double tax) {
		return this.getWage(wage) - this.getTax(tax, wage);		
	}
	/*Raise the wage of employee with 14$*/
	double getRaiseWage(double raise, double wage) {
		return this.getWage(wage) + raise;
	}
	/*Determines whether the number of hours of work
	 * exceeds 100*/
	boolean checkOverTime(int time) {
		return this.numberOfHours > time;
	}
	/*which consumes the gross pay and produces the amount of tax owed.
	 *For a gross pay of $240 or less, the tax is 0%;
	 *for over $240 and $480 or less, the tax rate is 15%;
	 *for any pay over $480, the tax rate is 28%.*/
	double taxWithRate(double wage1, double wage2, double wage) {
		double grossPay= this.getWage(wage);
		if (grossPay <= wage1)
			return 0.0;
		if (grossPay <= wage2)
			return grossPay * 0.15; 
				else return grossPay * 0.28; 
	}
}
