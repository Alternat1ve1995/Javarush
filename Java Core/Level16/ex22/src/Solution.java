
/*
Рекурсивное создание нитей
*/

public class Solution {
	static int count = 15;
	static volatile int countCreatedThreads;

	public static void main(String[] args) {
		if(countCreatedThreads < count){

			System.out.println(new GenerateThread());
		}

	}

	public static class GenerateThread extends Thread{

		public GenerateThread() {
			super(String.valueOf(++countCreatedThreads));
			Thread.currentThread().setName(String.valueOf(countCreatedThreads));
			start();
		}

		@Override
		public void run() {
			if(countCreatedThreads < count){

				System.out.println(new GenerateThread());
			}
		}

		public String toString(){
			return getName() + " created";
		}
	}
}