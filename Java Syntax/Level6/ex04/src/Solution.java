
import java.io.*;

/*
Чётные и нечётные циферки
*/

public class Solution {

	public static int even;
	public static int odd;

	public static void main(String[] args) throws IOException {

		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

		int     n = Integer.parseInt(reader.readLine());

		while (n > 0) {
			if ((n % 10) % 2 == 0)
				Solution.even++;
			else
				Solution.odd++;
			n /= 10;
		}
		System.out.println("Even: " + even + " Odd: " + odd);
	}
}
