
import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws InterruptedException {
		Read3Strings t1 = new Read3Strings();
		Read3Strings t2 = new Read3Strings();

		t1.start();
		t1.join();
		t2.start();
		t2.join();

		t1.printResult();
		t2.printResult();
	}

	public static class Read3Strings extends Thread implements Runnable {

		private String[]    sarr;

		@Override
		public void run() {

			String[]    sarr = new String[3];

			try
			{
				for (int i = 0; i < 3; i ++)
					sarr[i] = reader.readLine();
			}
			catch (Exception e) {}

			this.sarr = sarr;
		}

		public void printResult() {

			System.out.println(sarr[0] + " " + sarr[1] + " " + sarr[2]);
		}
	}
}
