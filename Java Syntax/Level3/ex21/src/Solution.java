
/* 
Не думать о секундах…
*/

public class Solution {
	public static void main(String[] args) {
		System.out.println(getCountSecondsPassedInCurrentHour(12345));
	}

	public static int getCountSecondsPassedInCurrentHour(int seconds) {
		int hours = seconds/3600;
		int secs = seconds - (hours * 3600);
		return (secs);
	}
}