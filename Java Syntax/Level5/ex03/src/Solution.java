

/* 
Трикотаж
*/

public class Solution {
	public static void main(String[] args) {
		Cat cat1 = new Cat("cat1", 3, 5, 10);
		Cat cat2 = new Cat("cat2", 3, 4, 12);
		Cat GODCAT = new Cat("GODCAT", 42, 42, 42);
	}

	public static class Cat {
		private String name;
		private int age;
		private int weight;
		private int strength;

		public Cat(String name, int age, int weight, int strength) {
			this.name = name;
			this.age = age;
			this.weight = weight;
			this.strength = strength;
		}
	}
}