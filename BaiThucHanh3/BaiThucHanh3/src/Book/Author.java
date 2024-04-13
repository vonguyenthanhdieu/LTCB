package Book;

public class Author {
	String name;
	int birthYear;
	public Author(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public boolean currentAuthor() {
		return this.birthYear >=1940;
	}
	public boolean same(Author that) {
		return (this.name.equals(that.name)) && (this.birthYear == that.birthYear);
	}
	public boolean sameGeneration(Author that) {
		return Math.abs(this.birthYear - that.birthYear) <=10;
	}
}
