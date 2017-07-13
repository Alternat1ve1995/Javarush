
/*
Статики и исключения
*/

public class Solution {
	public static int A = 0;

	static {
			A = A / 0;
	}

	public static int B = 5;

	public static void main(String[] args) {
		System.out.println(B);
	}
}
