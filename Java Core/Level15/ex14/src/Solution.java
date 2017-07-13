
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Статики-2
*/

public class Solution {
	public static int A;
	public static int B;

	static {
		try
		{
			A = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			B = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		}
		catch (IOException e)
		{

		}
	}

	public static final int MIN = min(A, B);

	public static void main(String[] args) {
		System.out.println(MIN);
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}
