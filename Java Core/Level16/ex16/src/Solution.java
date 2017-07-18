
/*
Отсчет на гонках
*/

public class Solution {
	public static volatile int countSeconds = 3;

	public static void main(String[] args) throws InterruptedException {
		RacingClock clock = new RacingClock();

		Thread.sleep(3500);
		clock.interrupt();
	}

	public static class RacingClock extends Thread {
		public RacingClock() {
			start();
		}

		public void run() {

			int     sec = 0;

			try
			{
				while (countSeconds > 0) {
					System.out.print(countSeconds + " ");
					Thread.sleep(1000);
					sec++;
					countSeconds--;
					if (sec > 3)
						this.interrupt();
				}
				System.out.println("Марш!");
			}
			catch (InterruptedException e)
			{
				System.out.println("Прервано!");
			}
		}
	}
}
