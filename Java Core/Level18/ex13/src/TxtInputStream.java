
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

	private FileInputStream		component;

	public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {

		super(fileName);
		if (!fileName.endsWith(".txt")) {
			super.close();
			throw new UnsupportedFileNameException();
		}
		this.component = new FileInputStream(fileName);
	}

	public static void main(String[] args) {
	}

}

