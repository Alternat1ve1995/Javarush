
/*
Цель установлена!
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int     ox = Integer.parseInt(reader.readLine());
		int     oy = Integer.parseInt(reader.readLine());

		if (ox > 0 && oy > 0)
			System.out.println(1);
		else if (ox < 0 && oy > 0)
			System.out.println(2);
		else if (ox < 0 && oy < 0)
			System.out.println(3);
		else if (ox > 0 && oy < 0)
			System.out.println(4);
	}
}
