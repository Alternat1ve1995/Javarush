
/*
Три числа
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int[]   arr = new int[3];

		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(reader.readLine());
		if (arr[0] != arr[1] && arr[1] == arr[2])
			System.out.println(1);
		else if (arr[1] != arr[0] && arr[0] == arr[2])
			System.out.println(2);
		else if (arr[2] != arr[1] && arr[1] == arr[0])
			System.out.println(3);
	}
}
