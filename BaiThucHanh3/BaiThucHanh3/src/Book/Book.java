package Book;

public class Book {
	String title;
	double price;
	int yearOfPublication;
	Author author;
	/**
	 * For each book, 
	 * the program should track the book’s title, its price, its year of publication, and the author. 
	 * A author has a name and birth year.
	 * @param author
	 * @param title
	 * @param price
	 * @param yearOfPublication
	 * Example:
	 * Author felleisen = new Author("Matthias Felleisen", 1960);
		Book htdch = new Book(felleisen, "How to Design Class Hierarchies", 0.0, 2004);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book aljafp = new Book(friedman, "A Little Java, A Few Pattern", 25.9, 1998);

	 */
	public Book(Author author , String title, double price, int yearOfPublication) {
		this.author = author;
		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
	}
	/**currentBook that checks whether the book was published in 2004 or 2003;*/
	public boolean currentBook() {
		return (this.yearOfPublication == 2004) || (this.yearOfPublication == 2003);
	}
	/**currentAuthor that determines whether a book was written by a current author (born after 1940);
	 */
	public boolean currentAuthor() {
		return this.author.currentAuthor();
	}
	/**thisAuthor that determines whether a book was written by the specified author; 
	 */
	public boolean thisAuthor(Author that) {
		return this.author.same(that);
	}
	/**sameAuthor that determines whether one book was written by the same author as some other book;
	 */
	public boolean sameAuthor(Book that) {
		return this.author.same(that.author);
	}
	/**sameGeneration that determines whether two books were written by two authors born less than 10 year apart.
	 */
	public boolean sameGeneration(Book that) {
		return this.author.sameGeneration(that.author);
	}
}
