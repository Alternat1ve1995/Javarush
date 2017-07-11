

/*
Суммирование
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int     sum = 0;

		while (true) {
			int curr = Integer.parseInt(reader.readLine());
			sum += curr;
			if (curr == -1)
				break;
		}
		System.out.println(sum);
	}
}
