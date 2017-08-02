
/*
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader		reader = new BufferedReader(new InputStreamReader(System.in));
		String				filename1 = reader.readLine();
		String				filename2 = reader.readLine();
		String				filename3 = reader.readLine();

		FileOutputStream 	fileOutputStream = new FileOutputStream(filename1);
		FileInputStream		fileInputStream2 = new FileInputStream(filename2);
		FileInputStream		fileInputStream3 = new FileInputStream(filename3);

		byte[]				buff = new byte[fileInputStream2.available()];

		fileInputStream2.read(buff);
		fileOutputStream.write(buff);
		buff = new byte[fileInputStream3.available()];
		fileInputStream3.read(buff);
		fileOutputStream.write(buff);

		fileOutputStream.close();
		fileInputStream2.close();
		fileInputStream3.close();
	}
}
