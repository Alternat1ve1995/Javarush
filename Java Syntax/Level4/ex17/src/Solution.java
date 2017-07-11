
/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int     n1 = Integer.parseInt(reader.readLine());
		int     n2 = Integer.parseInt(reader.readLine());

		if (n1 > n2)
			System.out.println(n2);
		else
			System.out.println(n1);
	}
}