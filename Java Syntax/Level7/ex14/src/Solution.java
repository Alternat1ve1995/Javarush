import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		int[]			arr = new int[20];
		int				maximum;
		int				minimum;

		for (int i = 0; i < 20; i++)
			arr[i] = Integer.parseInt(reader.readLine());
		maximum = arr[0];
		minimum = arr[0];
		for (int i : arr) {
			if (i < minimum)
				minimum = i;
			if (i > maximum)
				maximum = i;
		}
		System.out.println(maximum + " " + minimum);
	}
}