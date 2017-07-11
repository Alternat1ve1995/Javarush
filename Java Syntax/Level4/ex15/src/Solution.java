
/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
	public static strictfp void main(String[] args) throws Exception {
		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));

		double	t = Double.parseDouble(reader.readLine());

		while (t > 5.0)
			t -=5.0;
		if (t < 3.0)
			System.out.println("зелёный");
		else if (t >= 3.0 && t < 4.0)
			System.out.println("желтый");
		else
			System.out.println("красный");
	}
}