
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/*
Факториал
*/

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(reader.readLine());
		reader.close();

		System.out.println(factorial(input));
	}

	public static String factorial(int n) {

		BigInteger result = BigInteger.valueOf(1);

		if (n < 0)
			return ("0");
		else if (n == 0)
			return ("1");
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		return result.toString();
	}
}
