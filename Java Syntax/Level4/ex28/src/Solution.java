
/*
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int[]   arr = new int[3];
		int     positive = 0;
		int     negative = 0;

		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(reader.readLine());
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > 0)
				positive++;
			else if (arr[i] < 0)
				negative++;
		System.out.println("количество отрицательных чисел: " + negative);
		System.out.println("количество положительных чисел: " + positive);
	}
}
