
/*
Там, в синих глубинах стек-трейса…
*/

public class Solution {
	public static void main(String[] args) throws Exception {
		int deep = getStackTraceDeep();
	}

	public static int getStackTraceDeep() {
		System.out.println(Thread.currentThread().getStackTrace().length - 1);
		return (Thread.currentThread().getStackTrace().length - 1);
	}
}
