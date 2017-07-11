
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

/* 
Исключения. Просто исключения.
*/

public class Solution {
	public static void main(String[] args) throws Exception {
		try
		{
			method1();
		}
		catch (FileNotFoundException e)
		{

		}
		catch (NullPointerException e)
		{

		}
	}

	public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
		int i = (int) (Math.random() * 4);
		if (i == 0)
			throw new NullPointerException();
		if (i == 1)
			throw new ArithmeticException();
		if (i == 2)
			throw new FileNotFoundException();
		if (i == 3)
			throw new URISyntaxException("", "");
	}
}