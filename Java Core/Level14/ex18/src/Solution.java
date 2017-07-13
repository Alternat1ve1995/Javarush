
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
	public static List<Exception> exceptions = new ArrayList<Exception>();

	public static void main(String[] args) {
		initExceptions();

		for (Exception exception : exceptions) {
			System.out.println(exception);
		}
	}

	private static void initExceptions() {   //it's first exception
		try {
			float i = 1 / 0;

		} catch (Exception e) {
			exceptions.add(e);
		}

		exceptions.add(new ArithmeticException());
		exceptions.add(new ArrayIndexOutOfBoundsException());
		exceptions.add(new ArrayStoreException());
		exceptions.add(new ClassCastException());
		exceptions.add(new IllegalArgumentException());
		exceptions.add(new IllegalMonitorStateException());
		exceptions.add(new IllegalStateException());
		exceptions.add(new IndexOutOfBoundsException());
		exceptions.add(new NegativeArraySizeException());

	}
}
