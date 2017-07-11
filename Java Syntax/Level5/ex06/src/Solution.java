
/*
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int     count = 0;
		double  s = 0;

		while (true) {
			double  d = Double.parseDouble(reader.readLine());
			if (d == -1)
				break;
			s += d;
			count++;
		}
		System.out.println(s / count);
	}
}

