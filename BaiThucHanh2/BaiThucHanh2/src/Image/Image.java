package Image;

public class Image {
	int width;
	int height;
	String source;
	String quality;
	public Image(int width, int height, String source, String quality) {
		this.width = width;
		this.height = height;
		this.source = source;
		this.quality = quality;		
	}
	/*
	 * which determines whether the image’s height is larger than its width*/
	boolean isPortrain() {
		return this.height > this.width;
	}
	/*
	 * Which computers how many pixels the image contains*/
	int size() {
		return this.width * this.height;
	}
	/*
	 * which determines whether this image is the same
as a given one.*/
	boolean isLarger( Image that) {
		return this.size() > that.size();
	}
	boolean same( Image that) {
		if (this.source.equals(that.source)) 
			return true; else
			if ((this.width == that.width) &&
				(this.height == that.height)&&
				(this.quality.equals(that.quality)))
				 	return true; 
					else return false;
	}
	/*
	 * produces one of three strings, depending on the number of pixels in the image:
	 * "small" for images with 10,000 pixels or fewer;
	 * "medium" for images with between 10,001 and 1,000,000 pixels;
	 * "large" for images that are even larger than that.*/
	String sizeString(int pixels1, int pixels2) {
		if (size() < pixels1)
			return "small";
		if (size() < pixels2)
			return "medium";
		return "large";
	}
}
