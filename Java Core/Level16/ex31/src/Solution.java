
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<Thread> threads = new ArrayList<>(5);

	static {
		threads.add(new ThreadOne());
		threads.add(new ThreadTwo());
		threads.add(new ThreadThree());
		threads.add(new ThreadFour());
		threads.add(new ThreadFive());
	}

	public static void main(String[] args) {

		threads.get(2).start();
	}

	public static class ThreadOne extends Thread {

		@Override
		public void run() {

			while (true)
				try {}
				catch (Exception e) {}
		}
	}

	public static class ThreadTwo extends Thread {

		@Override
		public void run() {

			try {
				while (!isInterrupted());
				throw new InterruptedException();
			}
			catch (InterruptedException e) {
				System.out.println("InterruptedException");
			}
		}
	}

	public static class ThreadThree extends Thread {

		@Override
		public void run() {

			try
			{
				while (!isInterrupted()) {
					System.out.println("Ура");
					Thread.sleep(500);
				}
			}
			catch (InterruptedException e) {}
		}
	}

	public static class ThreadFour extends Thread implements Message {

		private boolean warning = false;

		@Override
		public void run() {

			while (!warning) {
				System.out.println("srav");
			}
		}

		@Override
		public void showWarning() {this.warning = true;}
	}

	public static class ThreadFive extends Thread {

		@Override
		public void run() {
			BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
			String          input = null;
			int             result = 0;

			try {
				while (!((input = reader.readLine()).equals("N"))) {

					result += Integer.parseInt(input);
				}
			}
			catch (Exception e) {}
			System.out.println(result);
		}
	}
}