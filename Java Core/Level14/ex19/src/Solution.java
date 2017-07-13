
/*
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		int				sq = 0;

		int[]			arr = new int[]{Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())};

		for (int n : arr)
			if (n <= 0)
				throw new Exception();
		if (arr[0] >= arr[1])
			sq = arr[1];
		else
			sq = arr[0];
		while (sq > 0) {
			if (arr[0] % sq == 0 && arr[1] % sq == 0) {
				System.out.println(sq);
				break;
			}
			sq--;
		}
	}
}
