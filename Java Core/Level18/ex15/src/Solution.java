
/*
Английские буквы
*/

import java.io.FileInputStream;

public class Solution {
	public static void main(String[] args) throws Exception {

		int		count = 0;
		FileInputStream fileInputStream	= new FileInputStream(args[0]);

		while (fileInputStream.available() > 0) {

			char	c = (char)fileInputStream.read();

			if (((int)c >= 'a' && (int)c <= 'z') || ((int)c >= 'A' && (int)c <= 'Z'))
				count++;
		}
		fileInputStream.close();
		System.out.println(count);
	}
}
