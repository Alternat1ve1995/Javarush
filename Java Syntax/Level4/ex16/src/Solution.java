
/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));

		int		n1 = Integer.parseInt(reader.readLine());
		int		n2 = Integer.parseInt(reader.readLine());
		int		n3 = Integer.parseInt(reader.readLine());

		if (n1 == n2 && n1 != n3)
			System.out.println(n2 + " " + n2);
		else if (n1 == n3 && n1 != n2)
			System.out.println(n1 + " " + n3);
		else if (n2 == n3 && n2 != n1)
			System.out.println(n2 + " " + n3);
		else if (n1 == n2 && n2 == n3)
			System.out.println(n1 + " " + n2 + " " + n3);
	}
}