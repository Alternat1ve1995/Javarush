
/*
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws  Exception {

		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		String			filename1 = reader.readLine();
		String			filename2 = reader.readLine();
		FileInputStream	fread = new FileInputStream(filename1);
		byte[]			buff = new byte[fread.available()];

		int len = fread.read(buff) - 1;
		int i = 0;

		while (i < len) {

			byte	tmp;

			tmp = buff[i];
			buff[i] = buff[len];
			buff[len] = tmp;
			i++;
			len--;
			if (i >= len)
				break;
		}
		FileOutputStream	fwrite = new FileOutputStream(filename2);

		fwrite.write(buff);
		fwrite.close();
		fread.close();
	}
}
