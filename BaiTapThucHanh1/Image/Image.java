package Image;

public class Image {
	int height;
	int width;
	String source;
	String quality;
	/*
	 * chuong trinh nay dung de mo ta hinh anh 
	 * mot hinh anh gom cac thuoc tinh
	 * height: int;
	 * width: int;
	 * source: String;
	 * quality: String;
	 * */
	public Image(int height, int width, String source, String quality) {
		this.height = height;
		this.width = width;
		this.source = source;
		this.quality = quality;
	}
}
