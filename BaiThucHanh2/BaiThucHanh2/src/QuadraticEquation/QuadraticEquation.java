package QuadraticEquation;

public class QuadraticEquation {
	double a;
	double b;
	double c;
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c =c;
	}
	/*calculate delta of quadratic equation*/
	double computeDelta() {
		return this.b * this.b - 4 * this.a * this.c;
	}
	/*the coefficients a, b, and c of a quadratic equation. 
	 * It then determines whether the equation is degenerate and, if not, how many solutions the equation has.
	 *  The method produces one of four symbols: "degenerate", "two", "one", or "none".*/
	String whatKind() {
		double delta = this.computeDelta();
		if (this.a == 0) return "degenerate";
		if (delta < 0) return "none";
		if (delta == 0) return "one solution";
		return "two solution";
	}
}
