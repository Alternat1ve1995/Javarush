
/* 
Минимум четырех чисел
*/
public class Solution {
	public static int min(int a, int b, int c, int d) {

		return (min(min(a, b), min(c, d)));
	}

	public static int min(int a, int b) {
		if (a < b)
			return (a);
		return (b);
	}

	public static void main(String[] args) throws Exception {
		System.out.println(min(-20, -10));
		System.out.println(min(-20, -10, -30, -40));
		System.out.println(min(-20, -10, -30, 40));
	}
}