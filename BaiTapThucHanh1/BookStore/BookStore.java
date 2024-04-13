package BookStore;

public class BookStore {
	String author;
	String title;
	double price;
	int yearOfPublication;
	/*
	 * Day la chuong trinh ho tro nhan vien cua hang sach.
	 * Moi cuon sach bao gom
	 * author: String;
	 * title: String;
	 * price: double;
	 * yearOfPublication: int*/
	public BookStore(String author, String title, double price, int yearOfPublication) {
		this.author = author;
		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		
	}
}
