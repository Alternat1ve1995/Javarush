
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
И еще один адаптер
*/

public class Solution {

	public static void main(String[] args) {

	}

	public static class PersonScannerAdapter implements PersonScanner {

		private Scanner		fileScanner;

		public PersonScannerAdapter(Scanner fileScanner) {
			this.fileScanner = fileScanner;
		}

		@Override
		public Person read() throws IOException {

			String		line = fileScanner.nextLine();
			String[]	data = line.split(" ");
			Date		birth;

			line = data[3] + " " + data[4] + " " + data[5];

			SimpleDateFormat	simpleDateFormat = new SimpleDateFormat(line);
			simpleDateFormat.applyPattern("dd MM yyyy");
			try
			{
				birth = simpleDateFormat.parse(line);
				return (new Person(data[1], data[2], data[0], birth));
			}
			catch (ParseException e)
			{
				return (null);
			}
		}

		@Override
		public void close() throws IOException {
			fileScanner.close();
		}
	}
}
