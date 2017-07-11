
/* 
Кошачья бойня
*/

public class Solution {
	public static void main(String[] args) {
		Cat cat1 = new Cat("cat1", 3, 5, 8);
		Cat cat2 = new Cat("cat2", 3, 4, 9);
		Cat godcat = new Cat("Godcat", 42, 42, 42);

		System.out.println(cat1.fight(cat2));
		System.out.println(cat1.fight(godcat));
		System.out.println(godcat.fight(cat2));
	}

	public static class Cat {
		protected String name;
		protected int age;
		protected int weight;
		protected int strength;

		public Cat(String name, int age, int weight, int strength) {
			this.name = name;
			this.age = age;
			this.weight = weight;
			this.strength = strength;
		}

		public boolean fight(Cat anotherCat) {
			int agePlus = this.age > anotherCat.age ? 1 : 0;
			int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
			int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

			int score = agePlus + weightPlus + strengthPlus;
			return score > 2; // return score > 2 ? true : false;
		}
	}
}