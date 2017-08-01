
/*
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		String			filename = reader.readLine();
		int				count = 0;

		FileInputStream	fileInputStream = new FileInputStream(filename);

		while (fileInputStream.available() > 0) {
			char	c = (char)fileInputStream.read();
			if (c == ',')
				count++;
		}
		fileInputStream.close();
		System.out.println(count);
	}
}
