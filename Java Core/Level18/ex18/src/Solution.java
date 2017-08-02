
/*
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader		reader = new BufferedReader(new InputStreamReader(System.in));
		String				filename1= reader.readLine();
		String				filename2 = reader.readLine();
		FileInputStream		fileInputStream1 = new FileInputStream(filename1);
		FileInputStream		fileInputStream2 = new FileInputStream(filename2);
		FileOutputStream	fileOutputStream = new FileOutputStream(filename1);
		byte[]				buff1 = new byte[fileInputStream1.available()];
		byte[]				buff2 = new  byte[fileInputStream2.available()];

		fileInputStream1.read(buff1);
		fileInputStream2.read(buff2);

		fileOutputStream.write(buff2);
		fileOutputStream.write(buff1);

		fileInputStream1.close();
		fileInputStream2.close();
		fileOutputStream.close();
	}
}
