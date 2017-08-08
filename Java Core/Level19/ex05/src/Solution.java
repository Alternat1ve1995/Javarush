
/*
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		String			filename1 = reader.readLine();
		String			filename2 = reader.readLine();
		FileReader		fileReader = new FileReader(filename1);
		FileWriter		fileWriter = new FileWriter(filename2);
		int		i = 1;

		while (fileReader.ready()) {
			char	c = (char)fileReader.read();

			if (i % 2 == 0)
				fileWriter.write(c);
			i++;
		}
		fileReader.close();
		fileWriter.close();
		reader.close();
	}
}
