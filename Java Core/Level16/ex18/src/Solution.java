
/*
А без interrupt слабо?
*/

public class Solution {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new TestThread());
		t.start();
		Thread.sleep(3000);
		ourInterruptMethod();
	}

	public static void ourInterruptMethod() {

		TestThread.interrupted = true;
	}

	public static class TestThread implements Runnable {

		public static boolean  interrupted = false;

		public void run() {
			while (!interrupted) {
				try {
					System.out.println("he-he");
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
