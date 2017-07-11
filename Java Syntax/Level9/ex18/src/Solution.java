
/*
Деление на ноль
*/

public class Solution {

	public static void main(String[] args) {

		try
		{
			divisionByZero();
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

	public static void divisionByZero() throws ArithmeticException {
		System.out.println(42 / 0);
	}
}
