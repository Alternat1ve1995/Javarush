
/*
Большая зарплата
*/

public class Solution {
	public static void main(String[] args) {
		String s = "Я не хочу изучать Java, я хочу большую зарплату";

		for (int i = 0; i < 40; i++) {
			if (s.charAt(i) != ' ')
				System.out.println(s.substring(i));
			else
				System.out.println(s.substring(i + 1));
		}
	}

}

