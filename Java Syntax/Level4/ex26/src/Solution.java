
/*
Описываем числа
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int     a = Integer.parseInt(reader.readLine());
		int     i = 0;

		if (a < 1 || a > 999)
			return ;
		if (a % 2 == 0)
			System.out.print("четное ");
		else
			System.out.print("нечетное ");
		while (a > 0) {
			a /= 10;
			i++;
		}
		if (i == 1)
			System.out.println("однозначное число");
		else if (i == 2)
			System.out.println("двузначное число");
		else
			System.out.println("трехзначное число");
	}
}
