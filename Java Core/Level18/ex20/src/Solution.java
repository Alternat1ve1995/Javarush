
/*
Встречаемость символов
*/

import java.io.FileInputStream;

public class Solution {
	public static void main(String[] args) throws Exception {

		byte[]				symbols = new byte[127];
		FileInputStream		fileInputStream = new FileInputStream(args[0]);

		while (fileInputStream.available() > 0) {

			int	c = fileInputStream.read();

			if (c < 128)
				symbols[c]++;
		}

		for (int i = 0; i < symbols.length; i++)
			if (symbols[i] > 0)
				System.out.println((char)i + " " + symbols[i]);
		fileInputStream.close();
	}
}
