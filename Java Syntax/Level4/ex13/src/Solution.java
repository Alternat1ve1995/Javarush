

/*
Количество дней в году
*/

import java.io.*;
import java.util.GregorianCalendar;

public class Solution {
	public static void main(String[] args) throws Exception {
		//напишите тут ваш код
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int year = Integer.parseInt(reader.readLine());
			GregorianCalendar calendar = new GregorianCalendar();
			if (calendar.isLeapYear(year)) {
				System.out.println("количество дней в году: 366");
			} else {
				System.out.println("количество дней в году: 365");
			}
		}
	}
}
