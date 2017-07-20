import common.BmpReader;
import common.PngReader;
import common.JpgReader;
import common.ImageReader;
import common.ImageTypes;

public class ImageReaderFactory {

	public static ImageReader  getImageReader(ImageTypes type) throws IllegalArgumentException {

		if (type == ImageTypes.BMP)
			return (new BmpReader());
		else if (type == ImageTypes.JPG)
			return (new JpgReader());
		else if (type == ImageTypes.PNG)
			return (new PngReader());
		else
			throw new IllegalArgumentException();
	}
}
