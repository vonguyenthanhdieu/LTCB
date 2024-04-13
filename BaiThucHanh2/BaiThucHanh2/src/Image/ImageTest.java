package Image;

import junit.framework.TestCase;
public class ImageTest extends TestCase {
	public void testConstructor() {
		Image image1 = new Image(4, 6, "Thuchanh", "high");
		Image image2 = new Image(5,2, "hinh anh", "low");
	}
	public void isPortrait() {
		Image image1 = new Image(4, 6, "Thuchanh", "high");
		Image image2 = new Image(5,2, "hinh anh", "low");
		assertTrue(image1.isPortrain());
		assertFalse(image2.isPortrain());
	}
	public void size() {
		Image image1 = new Image(4, 6, "Thuchanh", "high");
		Image image2 = new Image(5,2, "hinh anh", "low");
		assertEquals(image1.size(), 24);
		assertEquals(image2.size(), 10);
	}
	public void isLarger(Image that) {
		Image image1 = new Image(4, 6, "Thuchanh", "high");
		Image image2 = new Image(5,2, "hinh anh", "low");
		assertTrue(image1.isLarger(image2));
	}
	public void same(Image that) {
		Image image1 = new Image(4, 6, "Thuchanh", "high");
		Image image2 = new Image(5,2, "hinh anh", "low");
		assertFalse(image1.same(image2));
	}
	public void sizeString(int pixels1, int pixels2) {
		Image image1 = new Image(4, 6, "Thuchanh", "high");
		Image image2 = new Image(5000,25, "hinh anh", "low");
		assertEquals(image1.sizeString(10000, 1000000),"small");
		assertEquals(image2.sizeString(10000, 1000000),"medium");
	}
}

