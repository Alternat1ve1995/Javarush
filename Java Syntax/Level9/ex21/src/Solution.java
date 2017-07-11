
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader      read = new BufferedReader(new InputStreamReader(System.in));
		Date                date = new Date();
		SimpleDateFormat    sdate = new SimpleDateFormat();
		String              d = read.readLine();

		sdate.applyPattern("MM/dd/yyyy");
		date = sdate.parse(d);
		sdate.applyPattern("MMM dd, yyyy");
		d = sdate.format(date);
		System.out.println(d.toUpperCase());
	}
}
