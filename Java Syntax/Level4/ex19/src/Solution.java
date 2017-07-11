
/*
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int[]   arr = new int[3];

		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(reader.readLine());
		for (int i = arr.length - 1; i > 0; i--)
			for (int j = 1; j < arr.length; j++)
				if (arr[j] < arr[j - 1])
					arr[j] = arr[j] + arr[j - 1] - (arr[j - 1] = arr[j]);
		for (int i = arr.length - 1; i > -1; i--)
			System.out.println(arr[i]);
	}
}
