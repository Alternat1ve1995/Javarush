
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Используем RandomAccessFile
*/

public class Solution {
	public static void main(String... args) throws Exception {

		String				filename = args[0];
		int					number = Integer.parseInt(args[1]);
		String				text = args[2];

		byte[]				buff = new byte[text.length()];

		RandomAccessFile	rwFile = new RandomAccessFile(filename, "rw");

		rwFile.seek(number);
		rwFile.read(buff);

		rwFile.seek(rwFile.length());

		if (new String(buff).equals(text))
			rwFile.write("true".getBytes());
		else
			rwFile.write("false".getBytes());
	}
}
