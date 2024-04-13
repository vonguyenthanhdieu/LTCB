package Book;

import junit.framework.TestCase;
public class BookTest extends TestCase{
	public void testConstructor() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		Book htdch = new Book(felleisen, "How to Design Class Hierarchies", 0.0, 2004);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book aljafp = new Book(friedman, "A Little Java, A Few Pattern", 25.9, 1998);
	}
	public void currentBook() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		Book htdch = new Book(felleisen, "How to Design Class Hierarchies", 0.0, 2004);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book aljafp = new Book(friedman, "A Little Java, A Few Pattern", 25.9, 1998);
		assertTrue(htdch.currentBook());
		assertFalse(aljafp.currentBook());
	}
	public void currentAuthor() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		Book htdch = new Book(felleisen, "How to Design Class Hierarchies", 0.0, 2004);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book aljafp = new Book(friedman, "A Little Java, A Few Pattern", 25.9, 1998);
		assertTrue(htdch.currentAuthor());
		assertFalse(aljafp.currentAuthor());
	}
	public void thisAuthor() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		Book htdch = new Book(felleisen, "How to Design Class Hierarchies", 0.0, 2004);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book aljafp = new Book(friedman, "A Little Java, A Few Pattern", 25.9, 1998);
		assertTrue(htdch.thisAuthor(felleisen));
		assertFalse(htdch.thisAuthor(friedman));
	}
	public void sameAuthor() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		Book htdch = new Book(felleisen, "How to Design Class Hierarchies", 0.0, 2004);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book aljafp = new Book(friedman, "A Little Java, A Few Pattern", 25.9, 1998);
		assertTrue(htdch.sameAuthor(htdch));
		assertFalse(aljafp.sameAuthor(htdch));
	}
	public void sameGeneration() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		Book htdch = new Book(felleisen, "How to Design Class Hierarchies", 0.0, 2004);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book aljafp = new Book(friedman, "A Little Java, A Few Pattern", 25.9, 1998);
		assertTrue(htdch.sameGeneration(htdch));
		assertFalse(aljafp.sameGeneration(htdch));
	}
}