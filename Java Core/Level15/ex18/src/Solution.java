
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Разные методы для разных типов
*/

public class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		String          input = null;

		while (true) {
			input = reader.readLine();
			if (input.equals("exit"))
				break;
			try
			{
				if (input.contains("."))
					Solution.print(Double.parseDouble(input));
				else {
					int n = Integer.parseInt(input);
					if (n > 0 && n < 128)
						Solution.print((short) n);
					else if (n < 1 || n > 127)
						Solution.print(n);
					else
						Solution.print(input);
				}
			}
			catch (Exception e)
			{
				Solution.print(input);
			}
		}
	}

	public static void print(Double value) {
		System.out.println("Это тип Double, значение " + value);
	}

	public static void print(String value) {
		System.out.println("Это тип String, значение " + value);
	}

	public static void print(short value) {
		System.out.println("Это тип short, значение " + value);
	}

	public static void print(Integer value) {
		System.out.println("Это тип Integer, значение " + value);
	}
}
