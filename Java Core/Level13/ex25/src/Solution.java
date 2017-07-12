
/*
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		String          filename = reader.readLine();
		ArrayList<Integer>  list = new ArrayList<>();

		FileInputStream fileInputStream = new FileInputStream(filename);
		String          s = "";

		while (fileInputStream.available() > 0) {

			char c = (char)fileInputStream.read();
			if (c != '\n')
				s+= c;
			else {
				list.add(Integer.parseInt(s));
				s = "";
			}
		}

		Collections.sort(list);

		for (Integer n : list) {
			if (n % 2 == 0)
				System.out.println(n);
		}

		fileInputStream.close();
		reader.close();
	}
}
