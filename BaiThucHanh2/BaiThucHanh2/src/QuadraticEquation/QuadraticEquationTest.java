package QuadraticEquation;

import junit.framework.TestCase;
public class QuadraticEquationTest extends TestCase {
	public void testConstructor() {
		QuadraticEquation q1= new QuadraticEquation(0.0, 1.0, 2.0);
		QuadraticEquation q2= new QuadraticEquation(2.0, 1.0, 2.0);
		QuadraticEquation q3= new QuadraticEquation(1.0, 2.0, 1.0);
		QuadraticEquation q4= new QuadraticEquation(2.0, 3.0, 1.0);
	}
	public void testWhatKind() {
		QuadraticEquation q1= new QuadraticEquation(0.0, 1.0, 2.0);
		QuadraticEquation q2= new QuadraticEquation(2.0, 1.0, 2.0);
		QuadraticEquation q3= new QuadraticEquation(1.0, 2.0, 1.0);
		QuadraticEquation q4= new QuadraticEquation(2.0, 3.0, 1.0);
		assertEquals("degenerate", q1.whatKind());
		assertEquals("none", q2.whatKind());
		assertEquals("one solution", q3.whatKind());
		assertEquals("two solution", q4.whatKind());
		}

}
