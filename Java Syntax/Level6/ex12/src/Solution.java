
/*
Кот и статика
*/

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Cat>  cats = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			cats.add(new Cat());
		System.out.println(Cat.catCount);
	}

	public static class Cat {
		public static int catCount = 0;

		public Cat() {
			Cat.catCount++;
		}
	}
}
