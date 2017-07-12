
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		String  filename = reader.readLine();

		FileInputStream     fileInputStream = new FileInputStream(filename);

		String  s = "";

		while (fileInputStream.available() > 0) {
			char c = (char)fileInputStream.read();

			s += c;
		}

		System.out.println(s);
		fileInputStream.close();
		reader.close();
	}
}