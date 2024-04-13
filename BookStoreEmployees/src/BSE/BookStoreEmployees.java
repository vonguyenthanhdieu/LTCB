package BSE;

public class BookStoreEmployees {
		Author author;
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
		public BookStoreEmployees(Author author, String title, double price, int yearOfPublication) {
			this.author = author;
			this.title = title;
			this.price = price;
			this.yearOfPublication = yearOfPublication;
			
		}
}


