
/*
Разделение файла
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

		FileInputStream		fileReader1 = new FileInputStream(filename1);

		FileOutputStream	fileWriter2 = new FileOutputStream(filename2);
		FileOutputStream	fileWriter3 = new FileOutputStream(filename3);

		int					size = fileReader1.available();

		byte[]				buff = new byte[size];

		int len = fileReader1.read(buff, 0, size);

		fileWriter2.write(buff, 0, len / 2 + len % 2);
		fileWriter3.write(buff, len / 2 + len % 2, len / 2);

		fileReader1.close();
		fileWriter2.close();
		fileWriter3.close();
	}
}
