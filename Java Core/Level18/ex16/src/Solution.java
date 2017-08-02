
/*
Пробелы
*/

import java.io.FileInputStream;

public class Solution {
	public static void main(String[] args) throws Exception {

		FileInputStream		fileInputStream = new FileInputStream(args[0]);
		double				total = fileInputStream.available();
		double				spaces = 0;

		while (fileInputStream.available() > 0) {

			char c = (char)fileInputStream.read();

			if ((int)c == ' ')
				spaces++;
		}
		fileInputStream.close();

		double	result = 100.0 * (spaces / total);
		System.out.printf("%.2f", result);
	}
}
