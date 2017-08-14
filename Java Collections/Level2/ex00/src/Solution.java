import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
	public static void main(String... args) throws Exception {

		String					filename = args[0];
		String 					text = args[2];
		FileInputStream			fOut = new FileInputStream(filename);
		int						n = fOut.available() < Integer.parseInt(args[1]) ? fOut.available() : Integer.parseInt(args[1]);

		RandomAccessFile		randomAccessFile = new RandomAccessFile(filename, "rw");

		randomAccessFile.seek(n);
		randomAccessFile.write(text.getBytes());
	}
}
