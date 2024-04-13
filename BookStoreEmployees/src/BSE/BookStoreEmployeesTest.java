package BSE;

import junit.framework.TestCase;
public class BookStoreEmployeesTest extends TestCase{
	public void testConstrutor() {
		new BookStoreEmployees( new Author("Daniel Defoe",1876),"Robinson Crusoe",15.50,1719);
		new BookStoreEmployees( new Author("Joseph Conrad",1908),"Heart of Darkness",12.80,1902);
		new BookStoreEmployees( new Author("Pat Conroy", 1765),"Beach Music",9.50,1996);
	}
}
