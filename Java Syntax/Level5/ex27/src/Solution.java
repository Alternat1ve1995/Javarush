
/*
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {


	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat fd = new SimpleDateFormat("dd MM yyyy");
		System.out.println(fd.format(date));
	}
}